let lengthOfLongestSubstring = function(s) {
    let n = s.length;
    let res = 0;
    for (let i = 0; i < n; i += 1) {
        for (let j = i; j < n; j += 1) {
            if (checkRepetition(s, i, j)) {
                res = Math.max(res, j - i + 1)
            }
        }
    }
    return res;
};

let checkRepetition = function(s, start, end) {
    const set = new Set();
    for (let i = start; i <= end; i += 1) {
        const c = s[i];
        if(set.has(c)) {
            return false;
        }
        set.add(c);
    }
    return true;
}

let s = 'abcabcbb';
console.log(s);
console.log(lengthOfLongestSubstring(s));

s = 'bbbbb';
console.log(s);
console.log(lengthOfLongestSubstring(s));

s = 'pwwkew';
console.log(s);
console.log(lengthOfLongestSubstring(s));