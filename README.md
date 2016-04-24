#OMSCS: Machine Learning - Assignment 4 - Spring 2016

***********************************

This code was forked from https://github.com/juanjose49/omscs-cs7641-machine-learning-assignment-4. No substantial changes were made to the working code, although the grid worlds are different.

***********************************


Greetings! The purpose of this readme file is to offer the reader the steps required to make use of this BURLAP machine learning package with several of my own custom classes (included) and Eclipse (not included). This readme is split by the different Markov Decision Processes that were required for completion of the assignment. The instructions below will assume that you have already successfully downloaded and opened Eclipse.

##Running the Grid World: Low Difficulty Analysis:

1. While inside the directory structure burlap-assignment-4/src/burlap/assignment4/ right-click on the EasyGridWorldLauncher.
2. Go to the 'Run As' section and select Java Application.
3. All three algorithms will run and the aggregate analysis and optimal policies will be printed to the console.

##Running the Grid World: High Difficulty Analysis:

1. While inside the directory structure burlap-assignment-4/src/burlap/assignment4/ right-click on the HardGridWorldLauncher.
2. Go to the 'Run As' section and select Java Application.
3. All three algorithms will run and the aggregate analysis and optimal policies will be printed to the console.

##Sample Output
This is the sort of output you get out of the box by running the HardGridWorldLauncher as a Java Application:

```
/////Hard Grid World Analysis/////

This is your grid world:
[0,0,0,0,0,0,0,0,0,0,0]
[0,0,0,0,0,0,0,0,0,0,0]
[0,0,0,0,0,0,0,0,0,0,0]
[0,0,0,1,1,1,1,1,0,0,0]
[1,1,0,1,0,0,0,1,0,1,1]
[0,0,0,0,0,0,0,0,0,0,0]
[0,0,0,1,0,0,0,1,0,0,0]
[0,1,1,1,1,1,1,1,1,1,0]
[0,0,0,1,0,0,0,1,0,0,0]
[0,0,0,0,0,0,0,0,0,0,0]
[0,0,0,1,0,0,0,1,0,0,0]



//Value Iteration Analysis//
Passes: 1
...
Passes: 100
Value Iteration,3457,29818,83324,76323,9306,15436,9567,1184,1921,9111,5038,32566,28574,445,672,249,416,12,15,13,13,53,60,59,59,41,49,56,51,44,49,46,56,53,55,54,52,45,53,56,62,40,61,51,49,50,49,58,47,44,50,43,62,55,47,58,46,58,49,40,53,50,57,41,55,54,48,62,45,48,50,43,58,52,71,47,57,50,57,53,57,51,49,42,55,44,61,47,44,41,44,50,41,46,54,44,37,49,51,50

This is your optimal policy:
num of rows in policy is 11
[v,v,v,<,<,>,>,>,>,>,v]
[v,v,v,<,<,>,>,>,>,>,^]
[v,v,v,<,<,>,>,>,>,^,^]
[>,>,v,*,*,*,*,*,>,^,^]
[*,*,v,*,v,>,v,*,^,*,*]
[v,<,<,<,<,>,>,>,^,<,<]
[v,<,<,*,^,>,^,*,^,<,<]
[v,*,*,*,*,*,*,*,*,*,^]
[>,>,v,*,>,>,v,*,>,>,^]
[>,>,>,>,>,>,>,>,>,>,^]
[>,>,^,*,>,>,^,*,>,^,^]



Num generated: 1400; num unique: 95
//Policy Iteration Analysis//
Total policy iterations: 1
...
Total policy iterations: 100
Policy Iteration,1066,3779,127108,56029,8738,2890,11960,8602,6496,4314,260,1753,424,411,37,47,17,16,11,11,17,16,15,14,43,57,50,44,65,51,54,59,56,42,62,46,48,55,61,50,48,53,52,54,52,51,61,51,63,52,66,55,50,49,51,51,50,28,52,45,47,48,53,51,55,42,39,59,46,55,48,48,46,46,48,51,46,54,50,49,47,45,53,53,66,59,50,50,56,50,55,54,41,47,49,48,42,47,42,48
Passes: 36

This is your optimal policy:
num of rows in policy is 11
[>,>,>,>,>,>,>,>,>,>,v]
[>,>,>,>,>,>,>,>,>,^,^]
[>,>,>,>,>,>,>,>,^,^,^]
[^,^,^,*,*,*,*,*,^,^,^]
[^,^,^,*,*,*,*,*,^,^,^]
[^,^,^,*,*,*,*,*,^,^,^]
[^,^,^,*,*,*,*,*,^,^,^]
[^,^,^,*,*,*,*,*,^,^,^]
[^,^,^,>,>,>,>,>,^,^,^]
[^,^,>,>,>,>,>,>,^,^,^]
[^,^,>,>,>,>,>,>,^,^,*]



//Q Learning Analysis//
Q Learning,208,157,339,1062,32,57,209,172,854,29,858,140,134,44,1169,29,788,928,527,342,540,1185,55,1043,353,51,570,339,1045,37,1583,350,206,566,446,765,448,501,621,108,107,498,226,69,234,601,538,296,28,308,290,65,565,641,229,836,82,168,122,318,264,368,33,360,63,303,544,286,55,178,250,27,618,163,204,211,229,292,255,234,155,148,40,274,344,213,58,372,327,251,85,171,334,255,266,523,152,118,189,119
Passes: 36

This is your optimal policy:
num of rows in policy is 11
[v,v,v,<,<,>,>,>,>,>,^]
[v,v,v,<,<,>,>,>,>,>,^]
[v,v,v,<,<,>,>,>,>,^,^]
[>,>,v,*,*,*,*,*,>,^,^]
[*,*,v,*,v,>,v,*,^,*,*]
[v,<,<,<,<,>,>,>,^,<,<]
[v,<,<,*,^,>,^,*,^,<,<]
[v,*,*,*,*,*,*,*,*,*,^]
[>,>,v,*,>,>,v,*,>,>,^]
[>,>,>,>,>,>,>,>,>,>,^]
[>,>,^,*,>,>,^,*,>,^,^]


//Aggregate Analysis//

The data below shows the number of steps/actions the agent required to reach 
the terminal state given the number of iterations the algorithm was run.
Iterations,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100
Value Iteration,3457,29818,83324,76323,9306,15436,9567,1184,1921,9111,5038,32566,28574,445,672,249,416,12,15,13,13,53,60,59,59,41,49,56,51,44,49,46,56,53,55,54,52,45,53,56,62,40,61,51,49,50,49,58,47,44,50,43,62,55,47,58,46,58,49,40,53,50,57,41,55,54,48,62,45,48,50,43,58,52,71,47,57,50,57,53,57,51,49,42,55,44,61,47,44,41,44,50,41,46,54,44,37,49,51,50
Policy Iteration,1066,3779,127108,56029,8738,2890,11960,8602,6496,4314,260,1753,424,411,37,47,17,16,11,11,17,16,15,14,43,57,50,44,65,51,54,59,56,42,62,46,48,55,61,50,48,53,52,54,52,51,61,51,63,52,66,55,50,49,51,51,50,28,52,45,47,48,53,51,55,42,39,59,46,55,48,48,46,46,48,51,46,54,50,49,47,45,53,53,66,59,50,50,56,50,55,54,41,47,49,48,42,47,42,48
Q Learning,208,157,339,1062,32,57,209,172,854,29,858,140,134,44,1169,29,788,928,527,342,540,1185,55,1043,353,51,570,339,1045,37,1583,350,206,566,446,765,448,501,621,108,107,498,226,69,234,601,538,296,28,308,290,65,565,641,229,836,82,168,122,318,264,368,33,360,63,303,544,286,55,178,250,27,618,163,204,211,229,292,255,234,155,148,40,274,344,213,58,372,327,251,85,171,334,255,266,523,152,118,189,119

The data below shows the number of milliseconds the algorithm required to generate 
the optimal policy given the number of iterations the algorithm was run.
Iterations,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100
Value Iteration,342,17,8,11,11,12,27,45,28,50,34,35,32,76,35,34,57,62,56,45,41,62,49,56,62,90,65,55,68,64,82,81,103,102,83,91,86,80,81,82,112,144,123,72,108,113,134,146,102,135,77,161,159,163,88,84,68,72,92,104,114,85,78,87,84,82,72,81,73,82,104,114,73,105,107,91,83,73,66,65,77,73,85,107,69,77,63,86,119,166,78,76,77,89,68,72,57,65,60,65
Policy Iteration,22,22,254,14,21,17,21,43,39,78,33,39,39,39,43,47,50,57,59,62,55,65,95,65,119,96,87,92,82,98,93,104,149,127,123,290,98,152,121,207,134,136,158,114,142,174,150,160,152,159,191,276,148,199,443,227,169,169,154,162,204,170,197,182,170,207,212,185,199,191,184,237,221,239,216,281,468,232,281,282,217,298,482,336,239,227,227,250,259,318,256,359,322,270,254,281,254,253,263,282
Q Learning,10,9,16,34,15,11,10,29,35,28,31,44,31,26,23,25,27,101,55,39,34,66,20,37,82,32,73,55,45,42,39,78,58,71,64,55,84,70,79,68,71,81,67,29,73,62,73,79,70,106,88,104,115,130,107,83,83,99,93,107,97,136,57,177,67,85,117,96,102,108,131,79,133,119,105,142,103,80,106,165,177,126,133,138,127,151,75,111,134,145,128,135,124,105,92,122,193,256,118,117

The data below shows the total reward gained for 
the optimal policy given the number of iterations the algorithm was run.
Iterations,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100
Value Iteration Rewards,-4353.0,-29716.0,-83222.0,-77220.0,-9204.0,-15334.0,-9465.0,-1082.0,-1819.0,-9508.0,-4936.0,-32464.0,-28472.0,-343.0,-570.0,-147.0,-314.0,90.0,87.0,89.0,89.0,49.0,42.0,43.0,43.0,61.0,53.0,46.0,51.0,58.0,53.0,56.0,46.0,49.0,47.0,48.0,50.0,57.0,49.0,46.0,40.0,62.0,41.0,51.0,53.0,52.0,53.0,44.0,55.0,58.0,52.0,59.0,40.0,47.0,55.0,44.0,56.0,44.0,53.0,62.0,49.0,52.0,45.0,61.0,47.0,48.0,54.0,40.0,57.0,54.0,52.0,59.0,44.0,50.0,31.0,55.0,45.0,52.0,45.0,49.0,45.0,51.0,53.0,60.0,47.0,58.0,41.0,55.0,58.0,61.0,58.0,52.0,61.0,56.0,48.0,58.0,65.0,53.0,51.0,52.0
Policy Iteration Rewards,-2461.0,-3677.0,-127505.0,-55927.0,-8636.0,-2788.0,-11858.0,-8500.0,-6394.0,-4212.0,-158.0,-1651.0,-322.0,-309.0,65.0,55.0,85.0,-913.0,91.0,91.0,85.0,86.0,-912.0,88.0,59.0,45.0,52.0,58.0,37.0,51.0,48.0,43.0,46.0,60.0,40.0,56.0,54.0,47.0,41.0,52.0,54.0,49.0,50.0,48.0,50.0,51.0,41.0,51.0,39.0,50.0,36.0,47.0,52.0,53.0,51.0,51.0,52.0,-425.0,50.0,57.0,55.0,54.0,49.0,51.0,47.0,60.0,63.0,43.0,56.0,47.0,54.0,54.0,56.0,56.0,54.0,51.0,56.0,48.0,52.0,53.0,55.0,57.0,49.0,49.0,36.0,43.0,52.0,52.0,46.0,52.0,47.0,48.0,61.0,55.0,53.0,54.0,60.0,55.0,60.0,54.0
Q Learning Rewards,-6099.0,-1053.0,-1734.0,-3957.0,70.0,-954.0,-2603.0,-70.0,-3248.0,73.0,-1755.0,-2034.0,-531.0,58.0,-1566.0,73.0,-1185.0,-1825.0,-425.0,-1238.0,-438.0,-1083.0,47.0,-941.0,-251.0,-1947.0,-468.0,-237.0,-1442.0,65.0,-2480.0,-248.0,-104.0,-464.0,-344.0,-663.0,-346.0,-399.0,-519.0,-6.0,-5.0,-396.0,-124.0,-1965.0,-132.0,-499.0,-436.0,-194.0,74.0,-206.0,-188.0,-1961.0,-463.0,-1038.0,-127.0,-734.0,20.0,-66.0,-20.0,-216.0,-162.0,-266.0,69.0,-258.0,39.0,-201.0,-1441.0,-184.0,47.0,-76.0,-148.0,75.0,-516.0,-61.0,-102.0,-109.0,-127.0,-1189.0,-153.0,-132.0,-53.0,-46.0,-1936.0,-172.0,-1241.0,-111.0,44.0,-270.0,-225.0,-1147.0,17.0,-69.0,-232.0,-153.0,-164.0,-421.0,-50.0,-16.0,-87.0,-17.0
