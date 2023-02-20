# Coding-Challenges-Java
Coding challenges from freeCodeCamp Coding Interview Prep written in Java.

<h2>Algorithms</h2>
<ol>

<li><h4>Symmetric Difference</h4><details><summary>Definition</summary><blockquote>
The symmetric difference of two sets is the set of elements that belong to one of the sets but not to both. 
It represents the elements that are exclusive to each set and can be computed as the union of the elements in one set and the complement of the intersection of both sets. 
<br><br>The code takes a variable number of sets of a variable number of values and makes the symmetric difference of all of them.</blockquote></details>
</li>

<li><h4>Inventory Update</h4><details><summary>Definition</summary><blockquote>
Compare and update the inventory stored in a 2D array of items against a second 2D array of items of a fresh delivery. 
Updates the current existing inventory item quantities. 
If an item cannot be found, it adds the new item and quantity into the inventory array. 
The returned inventory array is sorted in alphabetical order by each item's name.</blockquote></details>
</li>

<li><h4>No Repeats Please</h4><details><summary>Definition</summary><blockquote>
Return the number of total permutations of the provided string that don't have repeated consecutive letters.
Assume that all characters in the provided string are each unique.

For example, aab should return 2 because it has 6 total permutations (aab, aab, aba, aba, baa, baa), but only 2 of them (aba and aba) don't have the same letter (in this case a) repeating.
</blockquote></details>

<li><h4>Pairwise</h4><details><summary>Definition</summary><blockquote>
Given an array arr, find element pairs whose sum equal the second argument arg and return the sum of their indices.

You may use multiple pairs that have the same numeric elements but different indices.
Each pair should use the lowest possible available indices. Once an element has been used it cannot be reused to pair with another element.
For instance, pairwise([1, 1, 2], 3) creates a pair [2, 1] using the 1 at index 0 rather than the 1 at index 1, because 0+2 < 1+2.

For example pairwise([7, 9, 11, 13, 15], 20) returns 6. The pairs that sum to 20 are [7, 13] and [9, 11].
We can then write out the array with their indices and values.
</blockquote></details>
</li>

<li><h4>Bubble Sort</h4><details><summary>Definition</summary><blockquote>
Bubble sort is a simple sorting algorithm that repeatedly steps through the list to be sorted, compares each adjacent pair of items and swaps them if they are in the wrong order. 
The pass through the list is repeated until the list is sorted.

Although bubble sort is simple to understand and implement, it is not very efficient and is not often used in practical applications for sorting large data sets.

</blockquote></details>
</li>

<li><h4>Selection Sort</h4><details><summary>Definition</summary><blockquote>
    Selection sort works by selecting the minimum value in a list and swapping it with the first value in the list.
    It then starts at the second position, selects the smallest value in the remaining list, and swaps it with the second element.
    It continues iterating through the list and swapping elements until it reaches the end of the list. Now the list is sorted.<br>
    Selection sort has quadratic time complexity in all cases.
</blockquote></details>
</li>

</ol>

<h2>Rosetta Codes Challenges</h2>
<ol>

<li><h4>100 Doors</h4><details><summary>Definition</summary><blockquote>
There are 100 doors in a row that are all initially closed. You make 100 passes by the doors.
The first time through, visit every door and 'toggle' the door (if the door is closed, open it;
if it is open, close it). The second time, only visit every 2nd door (i.e., door #2, #4, #6, ...) and toggle it.
The third time, visit every 3rd door (i.e., door #3, #6, #9, ...), etc., until you only visit the 100th door.
<br><br>The function determines the state of the doors after the last pass and prints each opened doors number</blockquote></details>
</li>

<li><h4>Dot Product</h4><details><summary>Definition</summary><blockquote>
The dot product is a mathematical operation that takes two vectors and returns a scalar value. It is calculated by multiplying the corresponding components of the two vectors and then summing the products. The dot product is also known as the scalar product or inner product, and is used in a variety of fields including physics, engineering, and computer graphics.</blockquote></details>
</li>

</ol>

<h2>MISC</h2>
<ul>
<li>My (BAD) solution for Trapping Rain Water <br><a href="https://leetcode.com/problems/trapping-rain-water/description/" target="_top">LeetCode site</a></li>
<li>Narcissistic Numbers<br><a href="https://www.codewars.com/kata/56b22765e1007b79f2000079" target="_top">CodeWars site</a></li>
</ul>
