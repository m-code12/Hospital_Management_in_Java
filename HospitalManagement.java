import java.io.*;
class HospitalManagement
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int choice,val,i=0;
        do
        {
            System.out.println("Welcome to Stay Alive Hospital");
            System.out.println("..............................");
            System.out.println("              MENU");
            System.out.println("..............................");
            System.out.println("Enter 1 for proceeding to the management and searching information regarding doctors");
            System.out.println("Enter 2 for proceeding to the management and searching information regarding patients");
            System.out.println("Enter 3 for room allocation");
            System.out.println("Enter 4 for billing");
            System.out.println("Enter -1 to exit");
            System.out.println("Enter your choice");
            val=Integer.parseInt(br.readLine());
           
            if(val==1)
            {
                DoctorManagement ob[]=new DoctorManagement[60];
                do
                {
                    int del,s;
                    System.out.println("Welcome to the Doctors section of this management system");
                    System.out.println("..........................");
                    System.out.println("           Menu");
                    System.out.println("..........................");
                    System.out.println("Enter 1 for adding an entry and details for the doctor");
                    System.out.println("Enter 2 for deleting the entry and details of a given doctor");
                    System.out.println("Enter 3 for searching if a doctor id and name is present in the list");
                    System.out.println("Enter -1 for exiting this section");
                    System.out.println("Enter your choice");
                    choice=Integer.parseInt(br.readLine());
                    int n,j,d,k;
                    switch(choice)
                    {
                        case 1:
                        ob[i]=new DoctorManagement();
                        ob[i].accept(ob,i);
                        i++;
                        break;
                        case 2:
                        DoctorManagement obj=new DoctorManagement();
                        int v;
                        System.out.println("Enter the entry to be deleted");;
                        del=Integer.parseInt(br.readLine());
                        v=obj.search(ob,del,i);
                     
                        if(v!=-1)
                            { if(ob[v]!=null){ob[v].delete(ob,v,i); i--;}}
                           
                        else
                            System.out.println("The element which is to be deleted is not present");
                       
                        break;
                        case 3:
                        DoctorManagement obj1=new DoctorManagement();
                        System.out.println("Enter the id to be searched");
                        s=Integer.parseInt(br.readLine());
                        d=obj1.search(ob,s,i);
                        if(d==-1)
                            System.out.println("The element is not present in the array");
                        else
                            {
                                System.out.println("The doctor works in this hospital");
                                System.out.println("The name is "+ob[d].name);
                                System.out.println("The id is "+ob[d].id);
                                System.out.println("The experience is "+ob[d].ex);
                                System.out.println("The phone number is "+ob[d].ph);
                                System.out.println("The field of expertise is"+ob[d].f);
                            }
                            break;
                default:
                while(choice!=-1)
                    System.out.println("Wrong choice");
               
           }
    }while(choice!=-1);
  }




    if(val==2)
    {
        PatientManagement ob[]=new PatientManagement[1000];
        do
        {
            System.out.println("Welcome to the Patients section of this management system");
            System.out.println("..........................");
            System.out.println("           Menu");
            System.out.println("..........................");
            System.out.println("Enter 1 for adding an entry and details for the Patient");
            System.out.println("Enter 2 for deleting the entry and details of a Patient");
            System.out.println("Enter 3 for searching patient id and name in present in the list");
            System.out.println("Enter -1 for exiting this section");
            System.out.println("Enter your choice");
            choice=Integer.parseInt(br.readLine());
            int n,j,del,s,d;
            switch(choice)
            {
                case 1:
                    ob[i]=new PatientManagement();
                    ob[i].accept(ob,i);
                    i++;
                    break;
                case 2:
                    int v;
                    System.out.println("Enter the entry to be deleted");;
                    del=Integer.parseInt(br.readLine());
                    PatientManagement obj2=new PatientManagement();
                    v=obj2.search(ob,del,i);
                   
                    if(v!=-1)
                        {if(ob[v]!=null) {ob[v].delete(ob,v,i); i--;}}
                    else
                        System.out.println("The element which is to be deleted is not present");
                   
                    break;
                   
                case 3:
                    PatientManagement obj3=new PatientManagement();
                    System.out.println("Enter the entry to be searched");
                    s=Integer.parseInt(br.readLine());
                    d=obj3.search(ob,s,i);
                    if(d==-1)
                        System.out.println("The element is not present in the array");
                    else
                        {
                            System.out.println("The element is present");
                            System.out.println("The name is "+ob[d].name);
                            System.out.println("The id is "+ob[d].id);
                            System.out.println("The illness is "+ob[d].ill);
                            System.out.println("The phone number is "+ob[d].ph);
                        }
                        break;
                default:
                    while(choice!=-1)
                        System.out.println("Wrong choice");
            }
        }while(choice!=-1);
}
if(val==3)
{
    RoomAllocation ob[]=new RoomAllocation[1000];
    int flag,v,re=-1,ida;
    do
    {
    System.out.println("Welcome to the room allocation section of this management system");
    System.out.println("..........................");
    System.out.println("           Menu");
    System.out.println("..........................");
    System.out.println("Enter 1 for allocating a room");
    System.out.println("Enter 2 for deleting the allocated room");
    System.out.println("Enter -1 for exiting this section");
    System.out.println("Enter your choice");
    choice=Integer.parseInt(br.readLine());
    RoomAllocation x=new RoomAllocation();  
    switch(choice)
    {
        case 1:
            do
            {
            System.out.println("Enter 1 for allocating an emergency room");
            System.out.println("Enter 2 for allocating Operation theatre");
            System.out.println("Enter 3 for allocating general ward");
            System.out.println("Enter -1 for exiting allocation of rooms");
            System.out.println("Enter your choice");
            flag=Integer.parseInt(br.readLine());
           
            if(flag==-1)
                break;
                else
                {
            System.out.println("Enter the ID of the patient to whom the room should be alloted");
            ida=Integer.parseInt(br.readLine());
            x.roomInitalize(flag);
            x.allocateRoom(ob,flag);}
           
        }while(flag!=-1);
        break;
        case 2:
        do
        {
            System.out.println("Enter 1 for emptying an emergency room");
            System.out.println("Enter 2 for emptying an Operation theatre");
            System.out.println("Enter 3 for emptying a general ward");
            System.out.println("Enter -1 for exiting deletion of rooms");
            System.out.println("Enter your choice");
            flag=Integer.parseInt(br.readLine());
           if(flag!=-1)
            {
            System.out.println("Enter the room number which has to be emptied");
            re=Integer.parseInt(br.readLine());
           
            x.deleteRoom(ob,flag,re);
           
            }
            else
            {
                while(flag!=-1)
                    System.out.println("Wrong choice");
            }
           
        }while(flag!=-1);
        break;
        default:
        while(choice!=-1)
            System.out.println("Wrong choice");
    }
  }while(choice!=-1);
}

if(val==4)
{
    int v,ids,r,amount=0; String rn;
    do
    {
        System.out.println("Welcome to the Billing section of this management system");
        System.out.println("..........................");
        System.out.println("           Menu");
        System.out.println("..........................");
        System.out.println("Enter 1 for displaying the bill");
        System.out.println("Enter -1 for exiting this section");
        System.out.println("Enter your choice");
        choice=Integer.parseInt(br.readLine());
        if(choice!=-1)
        {
            System.out.println("Enter the id of the patient");
            ids=Integer.parseInt(br.readLine());
            System.out.println("Enter the patient name");
            rn=br.readLine();
            System.out.println("Enter 1 if surgery was performed");
            System.out.println("Enter 2 if regular check up was carried out");
            System.out.println("Enter 3 if emergency surgery was performed");
            System.out.println("Enter your choice");
            System.out.println("Enter -1 to exit");
            r=Integer.parseInt(br.readLine());
            System.out.println("Enter the number of days");
            v=Integer.parseInt(br.readLine());
            switch(r)
            {
                case 1:
                amount=15000*v;
                break;
                case 2:
                amount=1000*v;
                break;
                case 3:
                amount=25000*v;
                break;
            }
            if(choice==1)
            {
                System.out.println(".........................BILL....................");
                System.out.println(".................STAY ALIVE HOSPITAL.............");
                System.out.println(".................................................");
                System.out.print("\tID");
                System.out.print("\tName");
                System.out.print("\tAmount");
                System.out.println();
                System.out.print("\t"+ids);
                System.out.print("\t"+rn);
                System.out.print("\t"+amount);
                System.out.println();
            }
            else
                if(choice!=1)
                    System.out.println("Wrong choice");
        }
    }while(choice!=-1);
}
}while(val!=-1);
}
}


class DoctorManagement
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String name,f;
    int id,ex,k; long ph;int del;
    void accept(DoctorManagement ob[],int i)throws IOException
    {
    System.out.println("Enter the name of the doctor");
    ob[i].name=br.readLine();
    System.out.println("Enter the field of specialization");
    ob[i].f=br.readLine();
    System.out.println("Enter the experience");
    ob[i].ex=Integer.parseInt(br.readLine());
    System.out.println("Asign an id to the doctor");
    ob[i].id=Integer.parseInt(br.readLine());
    int flag=0,k=0;
    do
    {
        if(search(ob,id,i)==-1)
        {
            ob[i].id=id;
            flag=1;
            break;
        }
        else
        {
            System.out.println("Enter a unique ID");
            ob[i].id=Integer.parseInt(br.readLine());
        }
     
    }while(flag!=1);
    System.out.println("Enter the phone number of the doctor");
    ph=Long.parseLong(br.readLine());
    }
    void delete(DoctorManagement ob[],int v,int i)
    {
        ob[v]=null;
        System.out.println("The element has been deleted");
    }
    int search(DoctorManagement ob[],int s,int i)
    {
        int k;
        for(k=0;k<i;k++)
        {
            if(ob[k].id==(s))
            {
                return k;
            }
           
        }
        return -1;
    }
}


class PatientManagement
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String name,f,ill;
    int id; long ph;
    void accept(PatientManagement ob[],int i)throws IOException
    {
    System.out.println("Enter the name of the patient");
    name=br.readLine();
    System.out.println("Enter the patient ID");
    id=Integer.parseInt(br.readLine());
    int flag=0,k=0;
    do
    {
        if(search(ob,id,i)==-1)
        {
            ob[i].id=id;
            flag=1;
            break;
        }
        else
        {
            System.out.println("Enter a unique ID");
            ob[i].id=Integer.parseInt(br.readLine());
        }
     
    }while(flag!=1);
    System.out.println("Enter the illness in brief");
    ill=br.readLine();
    System.out.println("Enter the phone number of the Patient");
    ph=Long.parseLong(br.readLine());
    }
    void delete(PatientManagement ob[],int v,int i)
    {
       
            ob[v]=null;
       
       
        System.out.println("The element has been deleted");
    }
    int search(PatientManagement ob[],int s,int i)
    {
        int k;
        for(k=0;k<i;k++)
        {
            if(ob[k].id==(s))
            {
                return k;
            }
        }
       
        return -1;
    }
}
class RoomAllocation extends PatientManagement
{
    int r1[]=new int[60];
    int i,x=0,i1=0,i2=20,i3=40;
    void roomInitalize(int flag)
    {
        if(flag==1)
        {
            for(i=i1;i<20;i++)
            {
                r1[i]=-1;
            }
            i1++;  
        }
        if(flag==2)
        {
            for(i=i2;i<40;i++)
            {
                r1[i]=-1;
            }
                i2++;  
        }
        if(flag==3)
        {
            for(i=i3;i<60;i++)
            {
                r1[i]=-1;
            }    
            i3++;  
               
        }
    }
   void allocateRoom(RoomAllocation ob[],int flag)
    {
        if(flag==1)
        {
        for(int i=0;i<20;i++)
        {
            if(r1[i]==-1)
            {
                r1[i]=1;
                System.out.println(r1[i]);
                break;
            }
        }
    }
    if(flag==2)
        {
        for(int i=20;i<40;i++)
        {
            if(r1[i]==-1)
            {
                r1[i]=1;
                System.out.println(r1[i]);
                break;
            }
        }
    }
    if(flag==3)
        {
        for(int i=40;i<60;i++)
        {
            if(r1[i]==-1)
            {
                r1[i]=1;
                System.out.println(r1[i]);
                break;
            }
        }
    }
                System.out.println("Room "+(i+1)+" has been allocated");
           
   
}
    void deleteRoom(RoomAllocation ob[],int flag,int re)
    {
       if(r1[re-1]==1)
       {
        r1[re-1]=-1;
        System.out.println("The room has been emptied");
        }
    else
    {
        System.out.println("The room  has been emptied");
    }
    }
}