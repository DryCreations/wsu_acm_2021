# Problem E - Chain Reaction

Mikey is very picky about his candy and has established a set of rules for when
to trade with other kids:

1. 5 bags of candy corn( _C_ )is worth 2 Kit-Kats( _K_ )
2. 4 Kit-Kats( _K_ )are worth 2 Reese’s cups( _R_ )
3. 3 Reese’s cups( _R_ )are worth two Snickers bars( _S_ )
Mikey never has trouble finding kids in his neighborhood willing to trade with
him, and he keeps trading as long as any of his three rules can be applied. Write
a program that reads in an integer specifying the number of test cases.

**Input** The first line of the input, n , denotes the total number of lines in the
input.
Each test case is contained on a single line, comprised of a set of letters: C , K ,
R , and S. Each denotes a corresponding piece of candy.
If more than one rule applies at the same time, they are always executed in the
order specified above.

Here is an example:

```
CCKKCCSCRRR
First the candy corn would be traded for two Kit-Kats:KKKKSRRR

Then the four Kit-Kats would be traded for two Reese’s cups:RRSRRR

Next, three Reese’s cups would be traded for two Snickers bars:SSSRR

At that point no more rules apply, and Mikey ended up with five pieces of candy,
so the program would output 5.
```

**Output** For each test case, output a line with an integer representing the
number of pieces of candy Mikey has remaining after completing all of this
trades.

## Sample Input

```
2
CCKKCCSCRRR
KKSRKRCCSKRS
```

## Sample Output

```
5
9
```
