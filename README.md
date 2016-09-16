# Second-Year-CSSE-NUIM
Algorithms and Data structures 2 labs, 2016


These are some of the lab questions are given in second semester CSSE Algorithms and DataStructres 2.
Each number corresponds with a partner .java files


---------------------------------------------------------------------------------------------------
lab 1 

Grab a stick. Pick a random point on the stick and break it in two. Take the longer piece. Now
pick a random point on the longer piece and break it in two, to make three pieces altogether.
What is the probability you can form a triangle? 


lab 2


The task is to complete the Huffman algorithm so that it takes in a sentence and
outputs Huffman codes. Several chunks of the code are missing in Huffman.java:
i) Fill in the code that creates the forest of trees for each letter and adds
them to the Priority Queue 
ii) Fill in the code that implements the Huffman algorithm
iii) Fill in the code that prints out all the results, including the rate of
compression achieved
When you have all that finished the output of your program should look like this:
Enter your sentence: The cats did not sit on the mat


lab 3 

Make yourself unbeatable at Scrabble by writing a computer program
that uses your letters to make the longest words possible and gives you
the top 10 suggestions, using dictionary .txt



lab 4

Objective 1:
To get the system working properly you need to create a decent hash function.
Modify the method getHashKey( ) so that it creates a unique number for each word
and then hashes it into the appropriate range. Use the modPow( ) method if you are
using modulo with large powers. The hash function should always produce a value
between 0 and the hash table size. Test to see if the number of collisions has been
reduced.
Objective 2:
If you want to use double hashing then you need a double hash function. Modify
the method getDoubleHashKey( ) so that it is based on more characters than just
the last one. Remember, the important features of a secondary hash function are
that it is different to the primary hash function (so that different items colliding
into a particular slot will follow different jumps) and never produces a 0 (so that it
doesn’t keep checking the same slot forever). The number that is returned by the
function is the size of the jumps that will be taken in case of a collision. Test to see
if the number of collisions has been reduced. For full marks, get the number of
collisions below 90,000, while keeping the load factor above 0.5.


lab 5

Write a program that identifies the following:
1) The S&P 500 company with the lowest drawdown between 2008 and mid-
2011, the actual percentage, and the dates between which it occurred
2) The S&P 500 company with the highest drawdown between 2008 and mid-
2011, the actual percentage, and the dates between which it occurred
A drawdown is the peak-to-trough decline during a specific record period of an
investment, fund or commodity. A drawdown is usually quoted as the percentage
between the peak and the trough. Use the data in the file StockData.txt. The
following code can be used for loading it in:

lab 6

Say you start rolling a dice. On average you will need 6 rolls to get a 6.
But what if, during the process of rolling for a 6, you get a Snapchat? Given that
you received a Snapchat at some point during the rolling process, how many rolls
will you need on average to get a 6?
Now let’s make it a bit more interesting. What if you sneeze and get a Snapchat
while you’re rolling for a 6. Now how many rolls will you need on average to get a
6?
One way to answer these questions is to actually roll a dice and wait for these
events to happen. Another quicker way is to write a Monte Carlo algorithm.

lab 7

W10ite a program that reads in a file representing a connected undirected weighted
graph in the form of an adjacency matrix and outputs the longest path between any
two vertices in the graph.
For example, if you load in the file graph.txt the output should look something
like this:
20
EBCJ
The idea is to find the two vertices for which the shortest distance between them is
as long as possible. For example, in the graph the shortest distance between E and J
is 20. There are no other vertices whose shortest path is as long as this. For any
other two vertices, there will be a path between them which is shorter than 20.
In effect, all that needs to be done is to run Dijkstra’s algorithm for every possible
starting position and find the longest Dijkstra path between any two vertices. 
This code might be useful as a guide, but it also might be best to code the
algorithm from scratch. Just code up what you do on paper, loop for all starting
positions, and output the longest Dijkstra path in the graph.
