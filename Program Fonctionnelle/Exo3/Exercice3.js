function longestWord(str) {
    const words = str.split(" ");
    let longest = "";

    for (const word of words) {
        if (word.length >= longest.length) {
            longest = word;
        }
    }

    return longest;
}

// Tests
console.log(longestWord('a b c d e fgh')); // "fgh"
console.log(longestWord('one two three')); // "three"
console.log(longestWord('red blue grey')); // "grey"
