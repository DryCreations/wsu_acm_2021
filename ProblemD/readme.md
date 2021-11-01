# Problem D - Don’t Trip!

Look out! You are being chased by a chainsaw-wielding axe murderer. Both you
and the axe murder run at a constant rate. The ground is muddy and you trip
once every minute. When this happens you get back up and continue running,
but the mud slows you down by10%. However, you do have a head start on the
axe murderer. The axe murderer is unaffected by the mud. Your task is to write
a program that figures out how many minutes you have to live.

**Input** The input will consist of three integers (one per line, in the following
order):

- _X_ : The number of feet per minute the axe murderer moves
- _Y_ : The number of feet per minute you move
- _Z_ : The number of feet you are away from the axe murderer when he
    notices you

For example:

10
12
5

In this case, there is one test case, and _X_ = 10, _Y_ = 12, and _Z_ = 5.

**Output** You should output the number of minutes you have to live, always
rounded DOWN.

For the previous example, the output should be 5. To see this, consider the table
below, which shows the position in feed of you and the axe murderer.

| Minute | Murderer | You |
| - | - | - |
| 0 | 0 | 5 |
| 1 | 10 | 17 |
| 2 | 20 | 27 |
| 3 | 30 | 36 |
| 4 | 40 | 44 |
| 5 | 50 | 51 |
| 6 | 60 | 58 |

So you lived 5 full minutes before the murderer reached you.


## Sample Input

```
10
12
5
```

## Sample Output

```
5
```
