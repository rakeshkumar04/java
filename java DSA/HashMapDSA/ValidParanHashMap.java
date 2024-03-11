package HashMapDSA;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Map<Character, Character> hmap = new HashMap<Character,Character>();
        hmap.put('(',')');
        hmap.put('{','}');
        hmap.put('[',']');
        Stack<Character> st = new Stack<>();
       for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(hmap.containsKey(c)){
                st.push(c);
            }else if(st.size()>0 && hmap.get(st.peek())== c){
                st.pop();
            }else{
                return false;
            }   
       }
       if(st.size()==0){
           return true;
       }
       return false; 
    }
}


class Solution2 {
    public boolean isValid(String s) {
         Stack<Character> stack = new Stack<>();

    char[] chars = s.toCharArray();

    for (char c : chars) {
        if (c == '(') {
            stack.push(')');
        }else if (c == '{') {
            stack.push('}');
        }else if (c == '[') {
            stack.push(']');
        }else if (stack.isEmpty() || stack.pop() != c) {
            return false;
        }
        
    }

    return stack.isEmpty();
        
    }
}


class Solution3 {
    public boolean isValid(String str) {
    int i = -1;
	char [] arr = new char[str.length()];
	for(char ch : str.toCharArray()){
	if(ch=='(' || ch == '{' || ch == '['){
	arr[++i] = ch;
	} else{
	if(i>=0 && (
	(arr[i] == '(' && ch == ')') ||
	(arr[i] == '{' && ch == '}') ||
	(arr[i] == '[' && ch == ']')
	)){
	i--;
	}else{
	return false;
	}
	}
	}
	return i==-1;
    }
}