# Problem K - The Ring

You are the head wall engineer in the zombie apocalypse and are currently
reviewing potential designs for new rings of walls to build around your settlement.
The proposed designs are submitted in the form of a two dimensional grid of
characters with a.representing empty space and a#representing a segment
of wall. Designs are judged based on two criteria: whether they form a closed
loop (preventing zombies from entering) and if they waste materials (every
minute outside the walls gathering materials is dangerous). A design has wasted
materials if there are any segments of the wall that aren’t part of the main loop
or if any segment of the wall in the main loop has more than two adjacent wall
segments. For example,
..##.
.#.#.
..#..
is an invalid design because the left segment in the top most row has three
adjacent segments and wastes materials.

```
Input The first line of input will be two integers m and n , 1 ≤ m, n ≤ 1024 ,
separated by a single space specifying the dimensions of the proposes plan. The
next m lines will have n characters each and all characters will be either a.or
a#.
```
All plans will contain at least one segment.

```
Output Your program should print outvalidif the proposed design is valid
andinvalidif it is not.
```

**Problem K - The Ring (cont.)**

**Sample Input**

5 5
..#..
.#.#.
#...#
.#.#.
..#..

**Sample Output**

valid