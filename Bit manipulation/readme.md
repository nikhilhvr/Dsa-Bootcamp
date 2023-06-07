
# Bit Manipulation

Bit manipulation is the act of algorithmically manipulating bits or other pieces of data shorter than a word. Computer programming tasks that require bit manipulation include low-level device control, error detection and correction algorithms, data compression, encryption algorithms, and optimization.

## Bitwise Operators

Bitwise operators are used to perform bit-level operations on integer values. The most common bitwise operators are:

- `AND` (`&`): The AND operator takes two numbers as operands and performs a logical AND operation on each pair of corresponding bits. The result is a new number where each bit is set to 1 if both bits in the operands were 1, and 0 otherwise.

- `OR` (`|`): The OR operator takes two numbers as operands and performs a logical OR operation on each pair of corresponding bits. The result is a new number where each bit is set to 1 if at least one of the bits in the operands was 1, and 0 otherwise.

- `XOR` (`^`): The XOR operator takes two numbers as operands and performs a logical XOR operation on each pair of corresponding bits. The result is a new number where each bit is set to 1 if the bits in the operands were different, and 0 otherwise.

- `NOT` (`~`): The NOT operator takes one number as an operand and performs a logical NOT operation on each bit. The result is a new number where each bit is set to 1 if the corresponding bit in the operand was 0, and 0 otherwise.

- `Left Shift` (`<<`): The left shift operator takes two numbers as operands. The first operand is the number to be shifted, and the second operand specifies the number of positions to shift the bits to the left. The result is a new number where the bits are shifted to the left by the specified number of positions.

- `Right Shift` `>>`: The right shift operator takes two numbers as operands. The first operand is the number to be shifted, and the second operand specifies the number of positions to shift the bits to the right. The result is a new number where the bits are shifted to the right by the specified number of positions.

## Common Bit Manipulation Operations

- **Set a bit**: To set a bit at the `n-th` position in a number `x`, we can use the bitwise OR operation with a mask that has all bits set to 0 except the `n-th` bit. The mask can be created by shifting 1 to the left by `n` positions.

```c
x |= (1 << n);
```

- **Clear a bit**: To clear a bit at the `n-th` position in a number `x`, we can use the bitwise AND operation with a mask that has all bits set to 1 except the `n-th` bit. The mask can be created by shifting 1 to the left by `n` positions and then taking the complement.

```c
x &= ~(1 << n);
```

- **Toggle a bit**: To toggle a bit at the `n-th` position in a number `x`, we can use the bitwise XOR operation with a mask that has all bits set to 0 except the `n-th` bit. The mask can be created by shifting 1 to the left by `n` positions.

```c
x ^= (1 << n);
```

- **Check if a bit is set**: To check if a bit at the `n-th` position in a number `x` is set, we can use the bitwise AND operation with a mask that has all bits set to 0 except the `n-th` bit. The mask can be created by shifting 1 to the left by `n` positions.

```c
if (x & (1 << n)) {
    // n-th bit is set
} else {
    // n-th bit is not set
}
```

