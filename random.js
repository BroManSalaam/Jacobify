let range = function range(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
}

module.exports.range = range;