Best Time to Buy and Sell Stock

This repository contains a Java solution for the classic Best Time to Buy and Sell Stock problem (LeetCode #121).

Problem Statement

You are given an array prices where prices[i] is the price of a given stock on the i-th day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If no profit is possible, return 0.

Solution Approach

Initialize:

min as the first price (smallest price seen so far).

profit as 0.

Iterate through the price array:

Update min if a smaller price is found.

Calculate potential profit (currentPrice - min).

Update profit if this new value is greater than the current profit.

Print the maximum profit after checking all days.

This ensures a single pass (O(n) time) and O(1) space.

Complexity Analysis

Time Complexity: O(n) (single pass through the array)

Space Complexity: O(1) (constant extra space)
