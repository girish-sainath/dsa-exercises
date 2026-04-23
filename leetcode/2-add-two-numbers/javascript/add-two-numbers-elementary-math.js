
function ListNode(val, next) {
    this.val = (val === undefined) ? 0 : val;
    this.next = (next === undefined) ? null : next;
}

function addTwoNumbers(l1, l2) {
    const dummyHead = new ListNode(0);
    let curr = dummyHead;
    let carry = 0;
    while (l1 || l2 || carry) {
        let val1 = (l1) ? l1.val : 0;
        let val2 = (l2) ? l2.val : 0;
        let sum = carry + val1 + val2;
        carry = Math.floor(sum / 10);
        curr.next = new ListNode(sum % 10);
        curr = curr.next;
        if (l1) l1 = l1.next;
        if (l2) l2 = l2.next;
    }
    return dummyHead.next;
}

const l13 = new ListNode(3);
const l12 = new ListNode(4, l13);
const l11 = new ListNode(2, l12);

const l23 = new ListNode(4);
const l22 = new ListNode(6, l23);
const l21 = new ListNode(5, l22);

const result = addTwoNumbers(l11, l21);
let current = result;
while (current) {
    console.log(current.val);
    current = current.next;
}