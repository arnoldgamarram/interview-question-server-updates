package com.interview;

import java.util.List;

public class Main {

	public int iterationsNumber(int rows, int cols, List<List<Integer>> servers) {

		Integer[][] matrix = new Integer[rows][cols];

		System.out.println("Input matrix ***");
		for (int p = 0; p < rows; p++) {
			List<Integer> row = servers.get(p);
			for (int q = 0; q < cols; q++) {
				Integer item = row.get(q);
				matrix[p][q] = item;
				System.out.print(item + " ");
			}
			System.out.println();
		}

		System.out.println();
		boolean allUpdated = false;
		int days = 0;
		while (!allUpdated) {
			matrix = updateNeighbors(rows, cols, matrix);
			System.out.println();
			System.out.println("Resulting Matrix (M) on day " + (days + 1));
			for (int p = 0; p < rows; p++) {
				for (int q = 0; q < cols; q++) {
					//System.out.print(matrix[p][q] + "(" + p + "," + q + ")" + " ");
					System.out.print(matrix[p][q] + " ");
				}
				System.out.println();
			}
			allUpdated = verifyAllItemsAreUpdated(rows, cols, matrix);
			System.out.println("Are all items updated ? " + allUpdated);
			days += 1;
		}
		return days;
	}

	private Integer[][] updateNeighbors(int rows, int cols, Integer[][] grid) {
		Integer[][] tmpGrid = new Integer[rows][cols];
		for (int p = 0; p < rows; p++) {
			for (int q = 0; q < cols; q++) {
				tmpGrid[p][q] = 0;
			}
		}
		for (int p = 0; p < rows; p++) {
			for (int q = 0; q < cols; q++) {
				Integer item = grid[p][q];
				if (item == 1) {
					if (p > 0) {
						if (q > 0) tmpGrid[p - 1][q - 1] = 1;
						tmpGrid[p - 1][q] = 1;
						if (q < cols - 1) tmpGrid[p - 1][q + 1] = 1;
					}
					if (q > 0) tmpGrid[p][q - 1] = 1;
					tmpGrid[p][q] = 1;
					if (q < cols - 1) tmpGrid[p][q + 1] = 1;

					if (p < rows - 1) {
						if (q > 0) tmpGrid[p + 1][q - 1] = 1;
						tmpGrid[p + 1][q] = 1;
						if (q < cols - 1) tmpGrid[p + 1][q + 1] = 1;
					}
				}
			}
		}
		return tmpGrid;
	}

	private boolean verifyAllItemsAreUpdated(int rows, int cols, Integer[][] tmpGrid) {
		for (int p = 0; p < rows; p++) {
			for (int q = 0; q < cols; q++) {
				if (tmpGrid[p][q] == 0) return false;
			}
		}
		return true;
	}

}
