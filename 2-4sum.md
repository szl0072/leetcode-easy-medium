####1. Two Sum
这类题可以算是刷题的动力吧，看过一次下一次居然真的会了，改了一个；错误提交居然过了，hashmap
（后有改进版，arr in order，用hashmap太慢，用双指针，从前和从后同时查找，167题）

####167. Two Sum II - Input array is sorted
1题改进版，双指针更快，从前和后同时查找，注意while判断条件，我写的l<=r考虑到会有【1，2，4】t=4就会需要2+2，另外遇到匹配项记得跳出循环。