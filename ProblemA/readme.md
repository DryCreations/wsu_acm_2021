# Problem A - Eek!

Your friend has an intense fear of certain words, but only one word at a time
(you have kind of weird friends). If a sentence contains the word your friend
is afraid of, regardless of spacing or capitalization, your friend will yell ‘eek’.
Otherwise, your friend will just read the sentence and say ‘meh’.

Write a program that reads in the word your friend is currently afraid of and a
set of sentences, and output whether they will say eek or meh after reading each
sentence.

**Input** The first line of input will be an integer, 1 ≤ n ≤ 100 , the number of
lines in the input. The next line will contain a single word, the word your friend
is afraid of. The next n − 1 lines will contain one sentence each.

**Output** Output should contain n − 1 lines, with either eek or meh on each
line.

## Sample Input

```
5
pumpkin
I don't understand the appeal of pumpkin spiced lattes.
They are not really that good.
They also don't really taste like pumpkin.
Pumpkin pie is the only good way to consume pumpkin.
```


## Sample Output

```
eek
meh
eek
eek
```
