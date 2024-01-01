problem:
Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.

Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. Your goal is to maximize the number of your content children and output the maximum number.

 

Example 1:

Input: g = [1,2,3], s = [1,1]
Output: 1
Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3. 
And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
You need to output 1.
Example 2:

Input: g = [1,2], s = [1,2,3]
Output: 2
Explanation: You have 2 children and 3 cookies. The greed factors of 2 children are 1, 2. 
You have 3 cookies and their sizes are big enough to gratify all of the children, 
You need to output 2.
 

Constraints:

1 <= g.length <= 3 * 104
0 <= s.length <= 3 * 104
1 <= g[i], s[j] <= 231 - 1




solution:
```

import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int contentChildren = 0;

        for (int greedIndex = 0, cookieIndex = 0; greedIndex < g.length && cookieIndex < s.length; cookieIndex++) {
            if (s[cookieIndex] >= g[greedIndex]) {
                contentChildren++;
                greedIndex++;
            }
        }

        return contentChildren;
    }
}

```



explanation:

In this problem, you are given two arrays:

1. `g`: An array representing the greed factors of children. Each element `g[i]` is the minimum size of a cookie that the child `i` will be content with.

2. `s`: An array representing the sizes of cookies. Each element `s[j]` is the size of cookie `j`.

Your goal is to distribute the cookies to maximize the number of content children. A child `i` will be content if there exists a cookie `j` such that `s[j]` is greater than or equal to `g[i]`.

The task is to find the maximum number of content children that can be achieved with the given greed factors and cookie sizes.

For example:

```
Input: g = [1,2,3], s = [1,1]
Output: 1
Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3. 
And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
You need to output 1.
```

The approach involves sorting the arrays `g` and `s` in ascending order. Then, iterate through the greed factors and assign cookies to children by selecting the smallest available cookie that satisfies the current child's greed factor. By doing this, you can maximize the number of content children.

