import java.util.*;

class Problem1{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
List<Integer> list = new ArrayList<>();
List<Integer> res = new ArrayList<>();
Set<Integer> set = new HashSet<>();
Map<Integer,Integer> freqMap = new HashMap<>();
int count = 0;

System.out.println("Enter array elements(enter a non-integer to stop): ");
while(true){
try{
int temp = sc.nextInt();
list.add(temp);
}
catch(Exception e){
break;
}
}
for(int val : list){
freqMap.put(val , freqMap.getOrDefault(val, 0) + 1);
set.add(val);
}

for(int val:set){
if(freqMap.get(val) == 1){
count++;
}
}

res.add(list.size());
res.add(set.size());
res.add(count);

System.out.println(res.toString());

}
}
