+++++++++++++++++++++++++++++++++++++++++++++++++  Cell 0 to '1'
>++++++++++  cell 1 to '\n'
>+++++++++  cell 2 to 9 as counter
[  Print numbers 1 to 9
<<  Data pointer to cell 0
.+  Print and increment cell 0
>.  Data pointer to cell 1 and print the newline
>-  Data pointer to cell 2 and decrement counter
]  Loop till counter is 0
+++++++++  Set cell 2 to 9
[  Set cell 0 to '1'
<<-  Data pointer to cell 0 and decrement
>>-  Data pointer to cell 2 and decrement counter
]  Loop till counter is 0
<<.  Data pointer to cell 0 and print '1'
-.   Decrement cell 0 and print '0'
>.   Data pointer to cell 1 and print newline
