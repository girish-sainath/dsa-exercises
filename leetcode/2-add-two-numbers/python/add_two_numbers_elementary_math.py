from typing import Optional

class ListNode(object):
    def __init__(self, val = 0, next = None):
        self.val = val
        self.next = next

class Solution:
    def add_two_numbers(
        self, l1: Optional[ListNode], l2: Optional[ListNode]
    ) -> Optional[ListNode]:
        dummy_head = ListNode(0)
        curr = dummy_head
        carry = 0
        while l1 or l2 or carry:
            l1_val = l1.val if l1 else 0
            l2_val = l2.val if l2 else 0
            column_sum = l1_val + l2_val + carry
            carry = column_sum // 10
            new_node = ListNode(column_sum % 10)
            curr.next = new_node
            curr = new_node
            l1 = l1.next if l1 else None
            l2 = l2.next if l2 else None
        return dummy_head.next

sol = Solution()
l13 = ListNode(3)
l12 = ListNode(4, l13)
l11 = ListNode(2, l12)

l23 = ListNode(4)
l22 = ListNode(6, l23)
l21 = ListNode(5, l22)

result = sol.add_two_numbers(l11, l21)

while result:
    print(result.val)
    result = result.next