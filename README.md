# Sorting Algorithms Benchmark

## Student Information
Name: Nada Tweel
Student ID:3166286
Section: CS

## Project Description
This project compares the execution time of five sorting algorithms using Java.

Array size: 100,000 elements.

## Results

Execution time in microseconds (µs).

| Algorithm | Random | Reverse | Partial | Sorted |
|---|---:|---:|---:|---:|
| Selection Sort | 3553895 | 3812682 | 1830708 | 1836252 |
| Insertion Sort | 1590138 | 3129889 | 382138 | 178 |
| Bubble Sort | 12970873 | 8648167 | 3660865 | 1562286 |
| Merge Sort | 27018 | 2973 | 4359 | 3182 |
| Quick Sort | 10033 | 2510 | 2081 | 973 |

## Analysis

Selection Sort, Insertion Sort, and Bubble Sort have O(N²) time complexity.

Merge Sort and Quick Sort are generally faster for large arrays because they have O(N log N) time complexity.

Insertion Sort performed very well on the fully sorted array because no shifting was needed.

Quick Sort gave the best result for the partially sorted array in this test.

The Quick Sort implementation uses the middle element as the pivot. This helps avoid the worst-case behavior on sorted and reverse-sorted arrays.

## Chart

![img_1.png](img_1.png)