import java.io.*;
import java.util.ArrayList;

public class MergeIntervals{

    public static class Interval{
        int start;
        int end;
        Interval(){
          start=0;
          end=0;  
        }
        Interval(int start, int end){
            this.start=start;
            this.end=end;
        }
    }

    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String line=br.readLine();
        String[] temp=line.trim().split("\\s+");
        ArrayList<Interval> intervals=new ArrayList<Interval>();
        for(int i=0;i<temp.length-1;i+=2)
            intervals.add(new Interval(Integer.parseInt(temp[i]),Integer.parseInt(temp[i+1])));
        line=br.readLine();
        temp=line.trim().split("\\s+");
        Interval newInterval=new Interval(Integer.parseInt(temp[0]),Integer.parseInt(temp[1]));
        intervals=merge(intervals, newInterval);
        for(int i=0;i<intervals.size();i++)
            System.out.print("["+intervals.get(i).start+","+intervals.get(i).end+"] ");
        br.close();
    }

    public static ArrayList<Interval> merge(ArrayList<Interval> intervals, Interval toInsert){
        if(intervals==null){
            ArrayList<Interval> newIntervals=new ArrayList<Interval>();
            newIntervals.add(toInsert);
            return newIntervals;
        }
        else if(intervals.size()==0){
            intervals.add(toInsert);
            return intervals;
        }
        int i=0;
        while(i<intervals.size()){
            Interval current=intervals.get(i);
            if(current.start>toInsert.end){
                intervals.add(i, toInsert);
                break;
            }
            else if(current.end<toInsert.start){
                i++;
                continue;
            }
            else{
                toInsert.start=Math.min(current.start, toInsert.start);
                toInsert.end=Math.max(current.end, toInsert.end);
                intervals.remove(i);
            }
        }
        if(i==intervals.size()){
            intervals.add(toInsert);
        }
        return intervals;
    }
}