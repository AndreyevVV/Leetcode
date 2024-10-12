---
created: 2024-10-04T08:30:55 (UTC +03:00)
source: https://leetcode.com/problems/divide-players-into-teams-of-equal-skill/description/?envType=daily-question&envId=2024-10-04
---
You are given a positive integer array `skill` of **even** length `n` where `skill[i]` denotes the skill of the `i^th` player. Divide the players into `n / 2` teams of size `2` such that the total skill of each team is **equal**.

The **chemistry** of a team is equal to the **product** of the skills of the players on that team.

Return _the sum of the **chemistry** of all the teams, or return_ `-1` _if there is no way to divide the players into teams such that the total skill of each team is equal._


**Example 1:**

``` Java
Input: skill = [3,2,5,1,3,4]
Output: 22
Explanation: 
Divide the players into the following teams: (1, 5), (2, 4), (3, 3), where each team has a total skill of 6.
The sum of the chemistry of all the teams is: 1 * 5 + 2 * 4 + 3 * 3 = 5 + 8 + 9 = 22.
```


**Example 2:**

``` Java
Input: skill = [3,4]
Output: 12
Explanation: 
The two players form a team with a total skill of 7.
The chemistry of the team is 3 * 4 = 12.
```


**Example 3:**

``` Java
Input: skill = [1,1,2,3]
Output: -1
Explanation: 
There is no way to divide the players into teams such that the total skill of each team is equal.
```

**Constraints:**

-   `2 <= skill.length <= 10:5`
-   `skill.length` is even.
-   `1 <= skill[i] <= 1000`