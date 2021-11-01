# Problem H - Monster Hunting

You’re a monster hunter! Monsters are overrunning Wright State, and it’s your
job to stop them. There are 5 kinds of monsters: zombies, mummies, ghosts,
vampires, and hobgoblins. You and your fellow students decide to make a game
out of how many monsters you can eliminate in an hour. You decide that zombies
are worth 1 point, mummies are worth 2 points, ghosts are worth 4 points, and
vampires are worth 8. Hobgoblins, being friendlly goblins, are worth -10 points.

After an hour, you tally up your scores to see who won. Your task is to create a
program that will determine who won, given a list of what monsters you and
the other students got.

```
Input The input will first specify the total number of input lines.
```
The next line will contain an integer representing the number of contestants, _c_.
The next _c_ lines contain names of contestants, where each line contains only one
name.

The next _c_ lines will contain strings that define how many of each monsters
each contestant killed. Monster lines will be comprised of an integer followed
by a string denoting the type of monster. _Z_ for zombies, _M_ for mummies, _G_
for ghosts, _V_ for vampires, and _H_ for hobgoblins. There is no particular order
monsters will appear in the line, and monsters might show up twice in one line.
If a contestant does not kill a particular type of monster, it will not appear in
the list. An example line might be:
1Z3G4M2V1H1Z

Which would score 28 points.

The first line of monsters will correspond with the first contestant named, the
second line of monsters will correspond with the second contestant named, and
so on.

```
Output Output the name of the contestant who won by scoring the most
points. There will be no cases that produce a tie or a negative score.
```

**Problem H - Monster Hunting (cont.)**

**Sample Input**

6
2
Dr. Cheatham
Dr. Doom
1Z4G
5M1H

**Sample Output**

Dr. Cheatham
