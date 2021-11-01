# Problem C - Forbidden Forest

While running away from a mad clown with a balloon-saw (a saw that only
damages balloons), you approach a dark forest. At the trailhead you see a sign
with a QR code for trail information which you of course stop and scan. The
website for these trails includes quite a bit of information like the slope and
distance (along the trail) of each section of the trail. However, in your hysterical
(and soon to be balloon-sawed) state, you need to know the total elevation change
of each trail to determine whether you have the energy to make it through the
forest (alive).
For example, data about a specific trail will state that it is completely flat for
500 meters, then switch to an 8 ◦incline for 1000 meters, and then switch to a
2 ◦decline for the final 500 meters.

The really scary part... Turns out the clown was NOT carrying a balloon-saw
but instead a balloon saw (a chainsaw made out of balloons)...

**Input** Input begins with a positive integer n ≤ 100 indicating the number
of trail sections. The following 2 ∗ n lines describe the trail sections from the
beginning to the end of the trail. Each trail section is described by two integers:
a and d , (− 50 ≤ a ≤ 50 , 1 ≤ d ≤ 10000 ) indicating its angle of elevation in
degrees and the distance in meters along that section of the trail, respectively.

**Output** Display the difference in elevation between the start of the trail and
the end of the trail in meters. The total difference in elevation will always be
greater than 0 meters. Round answers to the hundredths place. Always print
answers to two decimal places and include the leading 0 on answers between 0
and 1.

## Sample Input

```
3
0
500
8
1000
-2
500
```

##Sample Output

```
121.72
```
