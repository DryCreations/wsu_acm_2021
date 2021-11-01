# Problem J - Jigsaw Puzzle

Hello programmer, I want to play a game. The rules are simple, I will show
you a jigsaw puzzle and you will tell me how many pieces you have. The puzzle
will be transferred to you in the form of a two dimensional grid of characters,
either a.character to represent part of a piece or a#character representing a
boundary between the pieces.

A piece consists of a set of.characters that are adjacent horizontally or vertically
but not diagonally. For example the puzzle below has five pieces, one in each
corner and then another one in the middle.
...#...
...#...
###.###
...#...
...#...
Hurry up programmer, you’re running out of time!

```
Input The first line of input will consist of two numbers m and n separated
by a single space specifying the size of the puzzle. The next m lines will consist
of n characters each, each character being either.or#.
Both m and n will both be greater than or equal to 1 and less than 1024.
```
```
Output Your output must consist of a single integer specifying the number
of pieces in the puzzle. The number of pieces will be at least one and no more
than 65536.
```

**Problem J - Jigsaw Puzzle cont.**

**Sample Input**

3 3
..#
.#.
##.

**Sample Output** Output 1:

2