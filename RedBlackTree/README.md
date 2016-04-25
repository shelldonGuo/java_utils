# Adapted from http://algs4.cs.princeton.edu/33balanced/RedBlackBST.java.html

适用场景：
- 大量int型数据中查询是否已经存在，且数据集动态更新；
- Java中的HashMap/TreeMap也能完成此任务，但是由于另外存储了其他信息，当数据量大时（2亿条以上），耗费内存太大；


