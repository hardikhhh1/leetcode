struct ListNode {
    int val;
    ListNode *next;

};

class Solution {

public:
  void deleteNode(ListNode* node){
    ListNode* nextNode = node->next;
    node->val = nextNode->val;
    if(nextNode != NULL){
      node->next = nextNode->next;
    } else {
        node->next = NULL;
    }
  }
};
