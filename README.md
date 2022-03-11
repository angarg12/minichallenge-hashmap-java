# Minichallenge Hashmap

This is Java code for the Hashmap minichallenge.

Hash table (hash map or dictionary) is a data structure that maps keys to values. Hash tables use a hash function to
compute a value for an arbitrary key (e.g. numbers, strings, or complex structures). This value, called hash code, acts
as an index into an array of buckets. The desired value is stored in these buckets.

Ideally, the hash function will assign each key to a unique bucket. In practice, since the number of buckets is much smaller
than the number of keys, often several keys get hashed to the same value. This is called a collision.  Such collisions
are typically accommodated in some way, for instance storing several values in a bucket using a linked list.

Small hash tables can generate many collisions and degrade performance. Hash tables often resize dynamically to avoid this situation.
The resize operation is costly, but in well-dimensioned hash table, the average cost for each lookup is independent
of the number of elements stored in the table. This the expensive cost of resizing is average out over time, it is said
that the amortized cost per operation is constant O(1).

In practice Hash tables provide fast operations for storing and retrieving values.

## Running

* To run the unit tests `mvn test`