package com.interview;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(JUnit4.class)
public class MainTest {

	Main main;
	List<List<Integer>> servers;

	@Before
	public void before() {
		main = new Main();
	}

	@Test
	public void testCase1_should_return_three() {
		servers = dataCase1();
		int rows = 5;
		int columns = 5;
		int days = main.iterationsNumber(rows, columns, servers);
		Assert.assertEquals(3, days);
	}


	@Test
	public void testCase2_should_return_two() {
		servers = dataCase2();
		int rows = 5;
		int columns = 5;
		int days = main.iterationsNumber(rows, columns, servers);
		Assert.assertEquals(2, days);
	}

	private List<List<Integer>> dataCase1() {
		List<Integer> rowServers;
		List<List<Integer>> servers = new ArrayList<>();
		rowServers = Arrays.asList(0, 0, 0, 0, 0);
		servers.add(rowServers);
		rowServers = Arrays.asList(0, 0, 0, 0, 0);
		servers.add(rowServers);
		rowServers = Arrays.asList(0, 1, 0, 0, 0);
		servers.add(rowServers);
		rowServers = Arrays.asList(0, 0, 0, 0, 0);
		servers.add(rowServers);
		rowServers = Arrays.asList(1, 0, 0, 0, 0);
		servers.add(rowServers);
		return servers;
	}

	private List<List<Integer>> dataCase2() {
		List<Integer> rowServers;
		List<List<Integer>> servers = new ArrayList<>();
		rowServers = Arrays.asList(0, 0, 0, 0, 0);
		servers.add(rowServers);
		rowServers = Arrays.asList(0, 0, 0, 0, 1);
		servers.add(rowServers);
		rowServers = Arrays.asList(0, 1, 0, 0, 0);
		servers.add(rowServers);
		rowServers = Arrays.asList(0, 0, 0, 0, 0);
		servers.add(rowServers);
		rowServers = Arrays.asList(1, 0, 0, 0, 1);
		servers.add(rowServers);
		return servers;
	}

	private void printMatrix(List<List<Integer>> servers) {
		servers.forEach(integers -> {
			integers.forEach(item -> {
				System.out.print(item + " ");
			});
			System.out.println();
		});
	}

}
