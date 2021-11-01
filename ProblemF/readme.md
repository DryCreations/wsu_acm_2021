# Problem F - Lazy Trick-or-Treating


The neighborhood kids are lazy and came up with a plan to get a lot of candy
during trick-or-treating without having to walk as far: they visit the same houses
over and over. The people giving out the candy have started to catch on though

- if not enough other kids come to a house in between the lazy kids’ visits, they
    are noticed.
Your task is to write a program that reads in a number _x_ and a list of the
costumes of each trick-or-treater visiting a house. If the same costume appears
twice without at least _x_ other costumes in between, that kid is busted (and your
program should print out the costume followed by the wordsis busted!). For
this problem you’re going to assume that every trick-or-treater has a different
costume. Also note that the same kid can get busted more than once.

**Input** The starts with a positive integer x indicating the number of other
trick-or-treaters that must visit a house in order for repeat not to be noticed.
This will be followed by another postive integer v indicating the total number of
trick-or-treaters that visit the house.
Then there will be a series of v strings containing the costumes of the trick-or-
treaters, one per line.

**Output** The program should print out `<costume>` is busted!whenever a
costume appears again without at least x other costumes in between.

## Sample Input:

```
3
10
zombie
ghost
goblin
zombie
goblin
fairy
fireman
ghost
ghostbuster
fairy
```

## Sample Output:

```
zombie is busted!
goblin is busted!
```
