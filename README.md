# QMMS
Potential employer task

Task: We would like you to write a program that processes a text file stored on disk, decomposes it into individual words and then sorts the words alphabetically. The code should be written in C++ or Java.

Guidelines: As a guideline, the decomposition and sorting should be code you write yourself, not library code. The code should demonstrate what you consider production ready code, you may wish to consider class structure, formatting, comments and unit tests.

We’ll check the accuracy of the output and assess the program for style and readability. If your program meets the required standard we’ll invite you to the next interview.

The program is split into 4 classes:
ReadFile - reads the text file, tokenizes it (splits into words) and transforms into a String Array. This is done so we could implement a custom sorting mechanism. 
MergeSort - O(nlogn) time complexity and O(n) space complexity is a very efficient sorting algorithm perfect for the task and implimented from scratch
WriteFile - outputs sorted file to a disc
Main - pulls functionality together. I've also left a few "artifcacts" for the ease of checking (print statements) that could be commented out when not needed. 
Also, I've left Arrays class native method "sort" that also does the trick (currently commented out).

Several tests are attached. File writer test is not currently implemented (not working correctly), however will do its job, once adjusted.





