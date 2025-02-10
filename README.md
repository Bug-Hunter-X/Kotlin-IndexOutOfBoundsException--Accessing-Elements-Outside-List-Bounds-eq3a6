# Kotlin IndexOutOfBoundsException: Accessing Elements Outside List Bounds

This repository demonstrates a common error in Kotlin: the `IndexOutOfBoundsException` that occurs when attempting to access an element in a list using an index that is out of bounds.  The code includes a simple example and a solution demonstrating safe access to list elements.

## Bug
The `bug.kt` file contains code that attempts to access an element at index 10 in a list that only contains 5 elements. This results in an `IndexOutOfBoundsException`. 

## Solution
The `bugSolution.kt` file presents a solution that handles potential `IndexOutOfBoundsException` using safe calls and null checks. This prevents the application from crashing and provides a more robust way to access list elements.  Best practices for preventing this error include careful index validation and the use of Kotlin's safe call operator.