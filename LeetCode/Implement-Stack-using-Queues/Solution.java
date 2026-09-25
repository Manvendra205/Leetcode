1class MyStack {
2    Queue<Integer> q1;
3    Queue<Integer> q2;
4
5    public MyStack() {
6        q1 = new LinkedList<>();
7        q2 = new LinkedList<>();
8
9    }
10
11    public void push(int x) {
12        q2.offer(x);
13        while (!q1.isEmpty()) {
14
15            q2.offer(q1.poll());
16
17        }
18
19        Queue<Integer> temp = q1;
20
21        q1 = q2;
22
23        q2 = temp;
24
25    }
26
27    public int pop() {
28        return q1.poll();
29
30    }
31
32    public int top() {
33        return q1.peek();
34
35    }
36
37    public boolean empty() {
38        return q1.isEmpty();
39    }
40}
41
42/**
43 * Your MyStack object will be instantiated and called as such:
44 * MyStack obj = new MyStack();
45 * obj.push(x);
46 * int param_2 = obj.pop();
47 * int param_3 = obj.top();
48 * boolean param_4 = obj.empty();
49 */