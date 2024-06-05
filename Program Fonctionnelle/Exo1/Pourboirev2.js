function calculateTip(total, note) {
    const ratings = {
        "terrible": 0,
        "poor": 5,
        "good": 10,
        "great": 15,
        "excellent": 20
    };

    note = note.toLowerCase();

    if (note in ratings) {
        const percentage = ratings[note];
        const tip = (total * percentage / 100);
        return tip;
    } else {
        return "Rating not recognised";
    }
}

console.log(calculateTip(17, "Vive la france")); 



