# Problem L - Witches Coven

```
Its common sense to a witch: Join a coven as soon as you can.
```
Why? What a mortal question.

Witches gain power for each witch they bring into the coven! Additionally, they
gain power from other witches like a pyramid scheme.
Each witch has a spooky power level of 1 on their own. For every witch they
personally bring in, they gain 0.5 (1/2) of their power. Should that brought-in-
witch bring in a friend, the brought-in witch gains power, and the original witch
gains a portion of the new power gained, albeit at a dimished rate the further
the added witch is away from the original witch.

To find the power of any one witch you must find the power level of all the
witches brought in under this pyramid scheme below the witch in question. The
rate of drop off in power is 1 divided by the number of jumps from the witch in
question to a lower-tier witch + 1, so a witch brought in directly will give 1/2 of
its power while a witch one further hop away will only give 1/3 of its power.
Given some witch coven, find the strength of all the witches.
Constraints:

- The coven is a directed tree
- There will never be more than 13 witches in a coven
- All witches in the coven will have at least a cardinality of 1

```
Input Expected input (in order of lines):
```
- Num test cases / covens you will need to calculate for
- Number of witches in a given coven
- Flattened adjacency matrix
- Number of witches in a given coven
- Flattened adjacency matrix
Input Constraints:
- Where _N_ is the number of witches, The input adjecency matrix is _N xN_
in length
- There will be no more than 13 witches in a Coven
- The adjacency matrix is unweighted.
- The adjacency matrix will always be a single connected component.


**Output** A list of all the power levels of the witches per coven.

Output Constraints:

- The order of the witch power levels should be in the same order as the
    witches are in the adjacency matrix.
- All witches have a base power level of 1.
- The effective power level increase any one witch contributes is a function
    of the power of the sub-coven(s) beneath that witch.

**Sample Input**

1
6
0 1 1 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0 1 0 0 0 0 0 0

In this example, there is (1) that has (6) witches in it.

**Sample Output**

[2.7083333333333335, 1, 1, 1.6666666666666665, 1.5, 1]
