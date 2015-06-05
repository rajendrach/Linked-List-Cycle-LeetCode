package com.test.sample;

public class LLDetectCycle {
	int count =0;
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        int count = 0;
        Map<ListNode, Integer> nodeList = new HashMap<ListNode,Integer>();
        if(head!=null){
            nodeList.put(head,count);
            count++;
        }
        while(head != null && head.next != null ){
            head = head.next;
            if(nodeList.containsKey(head)){
                return head;
            }else{
                nodeList.put(head,count);
                count++;
            }
        }
       
        return null;
    }
}
