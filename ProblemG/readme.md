# Problem G - Candy Bucket

You’re going trick-or-treating! At each house you receive a piece of candy. As
you go house to house, sometimes you eat a piece of candy. At the end of the
night, you tip out your candy bucket to see what’s left.
Every time you receive a piece of candy, you put it on top of your other pieces.
Whenever you eat a piece of candy, you grab the first one you can reach. At the
end of the night, you tip your bucket over so that what’s at the bottom of the
bucket is at the top. Your job is to list, in order, the contents of the bucket afer
dumping it out.

```
Input The input will specify if you receive a piece of candy or if you eat the
first candy on top of the pile. You will never try to eat candy when you don’t
have any.
```
The first line of the input will be an integer, 3 ≤ _n_ ≤ 13 , the number of stops.
The stops are represented on the following n lines with a single string on each
line. The string will either be the name of the candy or _eat_.

```
Output Your program should compute the resulting list of candy in the correct
order, as described above, and print this information out.
```

**Problem G - Candy Bucket (cont.)**

**Sample Input**

10
Reese's Cup
Snickers
eat
M&M's
Sour Patch Kids
Tootsie Pop
Skittles
Snickers
eat
eat

**Sample Output**

Reese's Cup
M&M's
Sour Patch Kids
Tootsie Pop