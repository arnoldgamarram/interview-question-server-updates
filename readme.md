
**Interview Question**: 

**Introduction:**

There is a Matrix that hold servers, one server have an state, active equals to 1 or inactive equals to 0.
In one day a server in state 1 can update the neighbors servers in the matrix, however the adyancents servers have its state set to
one at the next day.

**Question :**

The question is How many days take update all servers in the matrix?. If :

**Inputs:** 

columns = 5``
 
rows = 5

M = [{0, 0, 0, 0, 0},
     {0, 0, 0, 0, 0},
     {0, 1, 0, 0, 0},
     {0, 0, 0, 0, 0},
     {0, 0, 0, 0, 0}]
     
     
for the day 1 the matrix becomes:

M = [{0, 0, 0, 0, 0},
     {1, 1, 1, 0, 0},
     {1, 1, 1, 0, 0},
     {1, 1, 1, 0, 0},
     {0, 0, 0, 0, 0}]

     
for the day 2 the matrix becomes:

M = [{1, 1, 1, 1, 0},
     {1, 1, 1, 1, 0},
     {1, 1, 1, 1, 0},
     {1, 1, 1, 1, 0},
     {1, 1, 1, 1, 0}]

     
for the day 3 the matrix becomes:

M = [{1, 1, 1, 1, 1},
     {1, 1, 1, 1, 1},
     {1, 1, 1, 1, 1},
     {1, 1, 1, 1, 1},
     {1, 1, 1, 1, 1}]



