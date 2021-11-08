 import java.util.*;
class admission
{
String name,adress,dob;
int ch,demo,dem;
void admission()
{
Scanner sc=new Scanner(System.in);
System.out.println("-->Enter Your Name::");
name=sc.nextLine();
System.out.println("-->Enter Your Adress::");
adress=sc.nextLine();
System.out.println("-->Enter Your Date of Birth::");
dob=sc.nextLine();
System.out.println("");
System.out.println("************************* MAIN MENU ****************************** \n");
System.out.println("|------------------------------------------------------------------|");
System.out.println("| CODE | | COURSE TYPE |");
System.out.println("| 10 | ----> | Admission After 10th Standard |");
System.out.println("| 12 | ----> | Admission After 12th Standard |");
System.out.println("|------------------------------------------------------------------|");
System.out.println("Enter Your Choice CODE from the following menu::");
ch=sc.nextInt();
switch(ch){
case 10:
double tenper;
int tench;
System.out.println("\n $$$$$$$$$$$$$$$ WELCOME TO THE POST 10TH STD ADMISSION $$$$$$$$$$$$$$$$");
System.out.println("\nEnter Your 10th Standard Percentage");
tenper=sc.nextDouble();
System.out.println("\nEnter your choice to the course you are willing to perseu::");
System.out.println("\n");
System.out.println("************************ COURSE MENU******************************* \n"); 
System.out.println("|--------------------------------------------------------------|");
System.out.println("| CODE | | COURSE NAMES |");
System.out.println("| 1 | ----> | Polytchic Course Admission:: |");
System.out.println("| 2 | ----> | 11 and 12 Science Stream Admission:: |");
System.out.println("| 3 | ----> | 11 and 12 Commerce Steram Admission:: |");
System.out.println("| 4 | ----> | 11 and 12 Arts Stream Admission:: |");
System.out.println("| 5 | ----> | To take Nominal Admission:: |");
System.out.println("|--------------------------------------------------------------|");
System.out.println("Enter Your Choice Reguarding to the menu::");
tench=sc.nextInt();
switch(tench)
{
case 1:int pvar;
System.out.println("\t\t\t\t!!!!!!!!!! WELCOME TO THE POLYTECHNIC ADMISSION !!!!!!!!!!");
System.out.println("\n\n");
System.out.println("FOLLOWING ARE SOME POLYTECHNIC COLLEGES NAMES CHOOSE THE SEUENCE AS PER YOUR CHOICE::");
System.out.println("\n");
System.out.println("***************** POLYTECHNIC COLLEGES MENU ************************* \n");
System.out.println("|-------------------------------------------------------------------|");
System.out.println("| College code | ----> | Colledge Name | CUT OFF |");
System.out.println("| 1016 | ----> | PLGPL Latur | 90% |");
System.out.println("| 1017 | ----> | VDF POLY Latur | 80% |");
System.out.println("| 1018 | ----> | JSPM POLY Latur | 70% |");
System.out.println("|--------------------------------------------------------------------|");
System.out.println("Enter Your Choice reguarding The college");
pvar=sc.nextInt();
switch(pvar)
{
case 1016:
String br;
if(tenper>=90)
{int i;
System.out.println("You are Eligible For PLGPL college Latur::");
System.out.println("\n\n");
System.out.println(" Following are the Branches with their code::");
System.out.println("******************* BRANCH MENU ******************** \n");
System.out.println("|--------------------------------------------------------------------|");
 System.out.println("| CODE | | BRANCHES | CUT OFF |");
System.out.println("| 2201 | -----> | Electronics | 95% |");
System.out.println("| 2202 | -----> | Electrical | 94% |");
System.out.println("| 2203 | -----> | Computer | 98% |");
System.out.println("| 2204 | -----> | Mechanical | 93% |");
System.out.println("| 2205 | -----> | Civil | 91% |");
System.out.println("| 2206 | -----> | Information Techn | 90% |");
System.out.println("|--------------------------------------------------------------------|");
System.out.println("Enter the Sequence of the branch code::");
int sr[]=new int[6];
for(i=0;i<=5;i++)
{
	sr[i]=sc.nextInt();
}
for(i=0;i<=5;i++)
{
if(sr[i]==2201&& tenper>=95)
{
System.out.println("");
System.out.println(" ________________________________________________");
System.out.println("| You Got Admission in ELECTRONICs Branch |");
System.out.println("|________________________________________________|");
demo=2201;
break;
}
else if(sr[i]==2202&& tenper>=94)
{
System.out.println("");
System.out.println(" ________________________________________________");
System.out.println("| You Got Admission in ELECTRICAL Branch |");
System.out.println("|________________________________________________|");
demo=2202;
break;
}
else if(sr[i]==2203&& tenper>=98)
{
System.out.println("");System.out.println(" ________________________________________________");
System.out.println("| You Got Admission in COMPUTER Branch |");
System.out.println("|________________________________________________|");
demo=2203;
break;
}
else if(sr[i]==2204&& tenper>=93)
{
System.out.println("");
System.out.println(" ________________________________________________");
System.out.println("| You Got Admission in MECHANICAL Branch |");
System.out.println("|________________________________________________|");
demo=2204;
break;
}
else if(sr[i]==2205&& tenper>=91)
{
System.out.println("");
System.out.println(" _______________________________________");
System.out.println("| You Got Admission in CIVIL Branch |");
System.out.println("|________________________________________|");
demo=2205;
break;}
else if(sr[i]==2206&& tenper>=90)
{
System.out.println("");
System.out.println(" ____________________________________________");
System.out.println("| You Got Admission in IF Branch |");
System.out.println("|____________________________________________|");
demo=2206;
break;
}
}
}
else
{
System.out.println("SORRY!!!!!!!!\n You are not Eligible for PLGPL Polytrchnic Course Because the percentage Linit is Above 90%");
}
 break;
case 1017:
if(tenper>=80)
{
String vbrch;
int i;
System.out.println("You are Eligible For VDF college Latur::");
System.out.println("\n\n");
System.out.println(" Following are the Branches with their code::");
System.out.println("\n**************** BRANCH MENU *********************** \n");
System.out.println("|---------------------------------------------------------------|");
System.out.println("| CODE | | BRANCH NAMES | CUT OFF |");
System.out.println("| 2201 | -----> | Electronics | 85% |");
System.out.println("| 2202 | -----> | Electrical | 80% |");
System.out.println("| 2203 | -----> | Computer | 92% |");
System.out.println("| 2204 | -----> | Mechanical | 90 |");
System.out.println("| 2205 | -----> | Civil | 87 |");
System.out.println("| 2206 | -----> | Information Techn | 83 |");
System.out.println("|---------------------------------------------------------------|");
System.out.println("Enter the Sequence of the branch code::");
int sr[]=new int[6];
for(i=0;i<=5;i++)
{
sr[i]=sc.nextInt();
}for(i=0;i<=5;i++)
{
if(sr[i]==2201&& tenper>=85)
{
System.out.println("");
System.out.println(" \n");
System.out.println("| You Got Admission in ELECTRONICs Branch | ");
System.out.println("|________________________________________________|");
demo=2201;
break;
}
else if(sr[i]==2202&& tenper>=80)
{
System.out.println("");
System.out.println(" ________________________________________________");
System.out.println("| You Got Admission in ELECTRICAL Branch |");
System.out.println("|________________________________________________|");
demo=2202;
break;
}
else if(sr[i]==2203&& tenper>=92)
{
System.out.println("");
System.out.println(" _______________________________________________");
System.out.println("| You Got Admission in COMPUTER Branch |");
System.out.println("|________________________________________________|");
demo=2203;
break;
}
else if(sr[i]==2204&& tenper>=90)
{
System.out.println("");
System.out.println(" ________________________________________________");
System.out.println("| You Got Admission in MECHANICAL Branch |");
System.out.println("|________________________________________________|");
demo=2204;
break;
}
else if(sr[i]==2205&& tenper>=87)
{
System.out.println("");
System.out.println(" ________________________________________");
System.out.println("| You Got Admission in CIVIL Branch |");
System.out.println(" ________________________________________|");
demo=2205;
break;
}
else if(sr[i]==2206&& tenper>=83){
System.out.println("");
System.out.println(" ____________________________________________");
System.out.println("| You Got Admission in IF Branch |");
System.out.println("|____________________________________________|");
demo=2206;
break;
}
}
}
else
{
System.out.println("SORRY!!!!!!!!!\n Your Not eligiblr For VDF College Because The minimum percentage is 80%::");
}
 break;
case 1018:
if(tenper>=70)
{
 String jbrch;
int i;
System.out.println("You are Eligible For JSPM college Latur::");
System.out.println("\n\n");
System.out.println(" Following are the Branches with their code::");
System.out.println("\n**************** BRANCH MENU ******************************* \n");
System.out.println("|------------------------------------------------------------------|");
System.out.println("| CODE | | BRANCH NAMES | CUT OFF |");
System.out.println("| 2201 | -----> | Electronics | 75% |");
System.out.println("| 2202 | -----> | Electrical | 70% |");
System.out.println("| 2203 | -----> | Computer | 85% |");
System.out.println("| 2204 | -----> | Mechanical | 72% |");
System.out.println("| 2205 | -----> | Civil | 74% |");
System.out.println("| 2206 | -----> | Information Techn | 80% |");
System.out.println("|------------------------------------------------------------------|");
System.out.println("Enter the Sequence of the branch code::");
int sr[]=new int[6];
for(i=0;i<=5;i++)
{
sr[i]=sc.nextInt();
}
for(i=0;i<=5;i++)
{
if(sr[i]==2201&& tenper>=75){
System.out.println("");
System.out.println(" ________________________________________________");
System.out.println("| You Got Admission in ELECTRONICs Branch | ");
System.out.println("|________________________________________________|");
demo=2201;
break;
}
else if(sr[i]==2202&& tenper>=70)
{
System.out.println("");
System.out.println(" _______________________________________________");
System.out.println("| You Got Admission in ELECTRICAL Branch |");
System.out.println("|________________________________________________|");
demo=2202;
break;
}
else if(sr[i]==2203&& tenper>=85)
{
System.out.println("");
System.out.println(" ________________________________________________");
System.out.println("| You Got Admission in COMPUTER Branch |");
System.out.println("|________________________________________________|");
demo=2203;
break;
}
else if(sr[i]==2204&& tenper>=72)
{
System.out.println("");
System.out.println(" _______________________________________________");
System.out.println("| You Got Admission in MECHANICAL Branch |");
System.out.println("|________________________________________________|");
demo=2204;
break;
}
else if(sr[i]==2205&& tenper>=74)
{
System.out.println("");
System.out.println(" ________________________________________");
System.out.println("| You Got Admission in CIVIL Branch |");
System.out.println("|________________________________________|");
demo=2205;
break;
}
else if(sr[i]==2206&& tenper>=80)
{
System.out.println("");System.out.println(" ____________________________________________");
System.out.println("| You Got Admission in IF Branch |");
System.out.println("|____________________________________________|");
demo=2206;
break;
}
}
}
else
{
System.out.println("SORRY!!!!!!!!!\n Your Not eligiblr For JSPM College Because The minimum percentage is 70%::");
}
 break;
}
break;
case 2:
int scich,mar;
System.out.println("\nEnter Your choice From the following code ::\n");
System.out.println("|------------------------------------------------------------------------------|");
System.out.println("| CODE | | COURSE NAME | CUT OFF |");System.out.println("| 101 | --> | Admission in PCB group:: | 85% |");
System.out.println("| 102 | --> | Admission in PCM group:: | 80% |");
System.out.println("| 103 | --> | Admission in JEE group:: | 80%+250 |");
System.out.println("| 104 | --> | Admission in AIIMS group:: | 85%+150 |");
System.out.println("|------------------------------------------------------------------------------|");
System.out.println("Note:-\n For taking the Admission in JEE and AIIMS group you have to clear College aptitite test ");
System.out.println("Enter Your choice");
scich=sc.nextInt();
switch(scich)
{
case 101:
int pcbch;
int pcb;
if(tenper>85)
{
System.out.println("You are eligiblr for PCB Admission::");
System.out.println("");
System.out.println("|----------------------------------------------------------------------|");
System.out.println("| CODE | | COLLEGE NAME | CUT OFF |");
System.out.println("| 111 | --> | SHAHU COLLEGE:: (For PCB) | 95% |");
System.out.println("| 112 | --> | DAYANAND COLLEGE:: (For PCB) | 90% |");
System.out.println("| 113 | --> | SONWANE COLLEGE:: (For PCB) | 87% |");
System.out.println("| 114 | --> | JAYKRANTI COLLEGE:: (For PCB) | 85% |");
System.out.println("|----------------------------------------------------------------------|");
System.out.println("Enter Your choice Sequence TO fill the Option Form::");
int pb[]=new int[4];
for(pcb=0;pcb<=3;pcb++)
{
pb[pcb]=sc.nextInt();
}
for(pcb=0;pcb<=3;pcb++)
{
if(pb[pcb]==111 && tenper>=95)
{
System.out.println("\n");
System.out.println(" ____________________________________________________________");
System.out.println("| Congrats your Got the Admission in the shahu college:: |");
System.out.println("|_____________________________________________________________|");
demo=111;
break;
}
else if(pb[pcb]==112 && tenper>=90)
{System.out.println("\n");
System.out.println(" ________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the DAYANAND college:: |");
System.out.println("|________________________________________________________________|");
demo=112;
break;
}
else if(pb[pcb]==113 && tenper>=97)
{
System.out.println("\n");
System.out.println(" ________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the SONWANE college:: |");
System.out.println("|________________________________________________________________|");
demo=113;
break;
}
else if(pb[pcb]==112 && tenper>=90)
{
System.out.println("\n");
System.out.println(" ________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the JAYKRANTI college:: |");
System.out.println("|________________________________________________________________|");
demo=114;
break;
}
}
}
else
{
System.out.println("SORRY !!! YOU ARE NOT ELIGIBLE FOR THE PCB TRY OTHER OPTION ");
System.out.println("Note:-\nYou can only Take addmission to PCB when Your percentage is more than 85%");
}
break;
case 102:
int pcmch;
int pcm;
if(tenper>80)
{
System.out.println("\nYou are eligiblr for PCM Admission::\n");
System.out.println("");
System.out.println("|-------------------------------------------------------------------|");
System.out.println("| CODE | | COLLEGE NAME | CUTOFF |");
System.out.println("| 211 | --> | SHAHU COLLEGE:: (For PCM) | 95% |");
System.out.println("| 212 | --> | DAYANAND COLLEGE:: (For PCM) | 90% |");
System.out.println("| 213 | --> | SONWANE COLLEGE:: (For PCM) | 85% |");
System.out.println("| 214 | --> | JAYKRANTI COLLEGE:: (For PCM) | 80% |");
System.out.println("|-------------------------------------------------------------------|");
System.out.println("Enter Your choice of Sequence For filling the Option Form::");
int pm[]=new int[4];
for(pcm=0;pcm<=3;pcm++)
{
pm[pcm]=sc.nextInt();
}
for(pcm=0;pcm<=3;pcm++)
{
if(pm[pcm]==211 && tenper>=95)
{
System.out.println("\n");
System.out.println(" ____________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the SHAHU college for PCM Stream:: |");
System.out.println("|____________________________________________________________________________|");
demo=211;
break;
}
else if(pm[pcm]==212 && tenper>=90){
System.out.println("\n");
System.out.println(" _______________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the DAYANAND college for PCM Stream:: |");
System.out.println("|_______________________________________________________________________________|");
demo=212;
break;
}
else if(pm[pcm]==213 && tenper>=85)
{
System.out.println("\n");
System.out.println(" ______________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the SONWANE college for PCM Stream:: |");
System.out.println("|______________________________________________________________________________|");
demo=213;
break;
}
else if(pm[pcm]==214 && tenper>=80)
{
System.out.println("\n");
System.out.println(" ________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the JAYKRANTI college for PCM Stream:: |");
System.out.println("|________________________________________________________________________________|");
demo=214;
break;
}
}
}
else
{
System.out.println("SORRY !!! YOU ARE NOT ELIGIBLE FOR THE PCM TRY OTHER OPTION ");
System.out.println("Note:-\nYou can only Take addmission to PCM when Your percentage is more than 80%");
}
break;
case 103:
int jee,entmar;
System.out.println("\n To take Admission to JEE Your must enter Your Entrence test Score::");
System.out.println("Note:-\n The Enternce marks Entered should be outoff 300::");
entmar=sc.nextInt();
if(tenper>=80 && entmar>=250)
{
System.out.println("\n You are Eligible for JEE Adimission::");
System.out.println("\n");
System.out.println("|---------------------------------------------------------------------------------------------------|");
System.out.println("| COODE | COLLEGE NAME | CUT OFF (10th per + Entrence) |");
System.out.println("| 311 | SHAHU College FOR JEE Batch | 98%+280 |");
System.out.println("| 312 | DAYANAND College FOR JEE Batch | 95%+270 |");
System.out.println("| 313 | SONWANE College FOR JEE Batch | 85%+260 |");
System.out.println("| 314 | JAYKRANTI College FOR JEE Batch | 80%+250 |");
System.out.println("|---------------------------------------------------------------------------------------------------|");
int je[]=new int[4]; 
for(jee=0;jee<=3;jee++)
{
je[jee]=sc.nextInt();
}
for(jee=0;jee<=3;jee++)
{
if(je[jee]==311 && tenper>=98 && entmar>=280)
{
System.out.println("\n");
System.out.println(" _______________________________________________________________________ ");
System.out.println("| CONGRATULATIONS YOU GOT ADMISSION IN SHAHU COLLRGE FOE JEE BATCH :: |");
System.out.println("|_______________________________________________________________________|");
demo=311;break;
}
else if(je[jee]==312 && tenper>=95 && entmar>=270)
{
System.out.println("\n");
System.out.println(" __________________________________________________________________________ ");
System.out.println("| CONGRATULATIONS YOU GOT ADMISSION IN DAYANAND COLLRGE FOE JEE BATCH :: |");
System.out.println("|__________________________________________________________________________|");
demo=312;
break;
}
else if(je[jee]==313 && tenper>=85 && entmar>=260)
{
System.out.println("\n");
System.out.println(" _________________________________________________________________________ ");
System.out.println("| CONGRATULATIONS YOU GOT ADMISSION IN SONWANE COLLRGE FOE JEE BATCH :: |");
System.out.println("|________________________________________________________________________|");
demo=313;
break;
}
else if(je[jee]==314 && tenper>=80 && entmar>=250)
{
System.out.println("\n");System.out.println(" __________________________________________________________________________ ");
System.out.println("| CONGRATULATIONS YOU GOT ADMISSION in JAYKRANTI COLLRGE FOE JEE BATCH :: |");
System.out.println("|__________________________________________________________________________|");
demo=314;
break;
}
}
}
else
{
System.out.println("\nYOU HAVENT GOT THE ADDMISSION PLEASE TRY NEXT OPTION::");
}
break;
case 104:
int aim,aimmar;
System.out.println("\n To take Admission to AIIMS Your must enter Your Entrence test Score::");
System.out.println("Note:-\n The Enternce marks Entered should be outoff 200::");
aimmar=sc.nextInt();
if(tenper>=80 && aimmar>=150)
{
System.out.println("\n You are Eligible for JEE Adimission::");
System.out.println("\n");System.out.println("|---------------------------------------------------------------------------------------------------|");
System.out.println("| COODE | COLLEGE NAME | CUT OFF (10th per + Entrence) |");
System.out.println("| 411 | SHAHU College FOR AIIMS Batch | 98%+180 |");
System.out.println("| 412 | DAYANAND College FOR AIIMS Batch | 95%+170 |");
System.out.println("| 413 | SONWANE College FOR AIIMS Batch | 85%+160 |");
System.out.println("| 414 | JAYKRANTI College FOR AIIMS Batch | 80%+150 |");
System.out.println("|---------------------------------------------------------------------------------------------------|");
System.out.println("Enter Your Choice college Code to fill the option Form ::");
int aims[]=new int[4]; 
for(aim=0;aim<=3;aim++)
{
aims[aim]=sc.nextInt();
}
for(aim=0;aim<=3;aim++)
{
if(aims[aim]==411 && tenper>=98 && aimmar>=180)
{
System.out.println("\n");
System.out.println(" _________________________________________________________________________ ");
System.out.println("| CONGRATULATIONS YOU GOT ADMISSION IN SHAHU COLLRGE FOE AIIMS BATCH :: |");
System.out.println("|_________________________________________________________________________|");
demo=411;
break;
}
else if(aims[aim]==412 && tenper>=95 && aimmar>=170)
{
System.out.println("\n");
System.out.println(" ____________________________________________________________________________ ");
System.out.println("| CONGRATULATIONS YOU GOT ADMISSION IN DAYANAND COLLRGE FOE AIMMS BATCH :: |");
System.out.println("|____________________________________________________________________________|");
demo=412;
break;
}
else if(aims[aim]==413 && tenper>=85 && aimmar>=160)
{
System.out.println("\n");
System.out.println(" ___________________________________________________________________________ ");
System.out.println("| CONGRATULATIONS YOU GOT ADMISSION IN SONWANE COLLRGE FOE AIIMS BATCH :: |");
System.out.println("|___________________________________________________________________________|");
demo=413;
break;
}else if(aims[aim]==414 && tenper>=80 && aimmar>=150)
{
System.out.println("\n");
System.out.println(" _____________________________________________________________________________ ");
System.out.println("| CONGRATULATIONS YOU GOT ADMISSION in JAYKRANTI COLLRGE FOE AIIMS BATCH :: |");
System.out.println("|_____________________________________________________________________________|");
demo=414;
break;
}
}
}
else
{
System.out.println("\nYOU HAVENT GOT THE ADDMISSION PLEASE TRY NEXT OPTION::");
}
break;
}
break;
case 3:
int come;
if(tenper>70)
{
System.out.println("You are eligiblr for Admission in COMMERCE college::");
System.out.println("");System.out.println("|------------------------------------------------------------------------|");
System.out.println("| CODE | | COLLEGE NAME | CUT OFF |");
System.out.println("| 511 | --> | SHAHU COLLEGE OF COMMERCE:: | 85% |");
System.out.println("| 512 | --> | DAYANAND COLLEGE OF COMMERCE:: | 80% |");
System.out.println("| 513 | --> | RAJMATA JIJAMATA COMMERCE COLLEGE:: | 75% |");
System.out.println("| 514 | --> | JAYKRANTI COMMERCE COLLEGE:: | 70% |");
 System.out.println("|------------------------------------------------------------------------|");
System.out.println("Enter Your choice Seaquence to fill the Option Form::");
int com[]=new int[4];
for(come=0;come<=3;come++)
{
com[come]=sc.nextInt();
}
for(come=0;come<=3;come++)
{
if(com[come]==511 && tenper>85)
{
System.out.println("\n");
System.out.println(" ________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the Shahu college in Commerce Stream:: |");
System.out.println("|________________________________________________________________________________|");demo=511;
break;
}
else if(com[come]==512 && tenper>80)
{
System.out.println("\n");
System.out.println(" __________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the DAYANAND college in Commerce Stream:: |");
System.out.println("|___________________________________________________________________________________|");
demo=512;
break;
}
else if(com[come]==513 && tenper>75)
{
System.out.println("\n");
System.out.println(" ___________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the RAJMATA JIJAMATA college in Commerce Stream:: |");
System.out.println("|___________________________________________________________________________________________|");
demo=513;
break;
}
else if(com[come]==514 && tenper>70)
{System.out.println("\n");
System.out.println(" ____________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the JAYKRANTI college in Commerce Stream:: |");
System.out.println("|____________________________________________________________________________________|");
demo=514;
break;
}
}
}
else
{
System.out.println("SORRY !!! YOU ARE NOT ELIGIBLE FOR THE COMMERCE TRY OTHER OPTION ");
System.out.println("Note:-\nYou can only Take addmission to COMMERCE when Your percentage is more than 70%");
}
break;
case 4:
int art;
if(tenper>50)
{
System.out.println("You are eligiblr for Arts Admission::");
System.out.println("");
System.out.println("|------------------------------------------------------------------|");
System.out.println("| CODE | | COLLEGE NAME | CUT OFF |");
System.out.println("| 611 | --> | SHAHU COLLEGE OF ARTS:: | 80% |");
System.out.println("| 612 | --> | DAYANAND COLLEGE OF ARTS:: | 75% |");
System.out.println("| 613 | --> | SONWANE COLLEGE OF ARTS:: | 60% |");
System.out.println("| 614 | --> | JAYKRANTI COLLEGE OF ARTS:: | 50% |");
System.out.println("|------------------------------------------------------------------|");
System.out.println("Enter Your choice::");
int ar[]=new int[4];
for(art=0;art<=3;art++)
{
ar[art]=sc.nextInt();
}
for(art=0;art<=3;art++)
{
if(ar[art]==611 && tenper>=80)
{
System.out.println("\n");
System.out.println(" _____________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the Shahu college FOR ARTS:: |");
System.out.println("|_____________________________________________________________________|");
demo=611;break;
}
else if(ar[art]==612 && tenper>=75)
{
System.out.println("\n");
System.out.println(" ________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the DAYANAND college FOR ARTS:: |");
System.out.println("|________________________________________________________________________|");
demo=612;
break;
}
else if(ar[art]==613 && tenper>=60)
{
System.out.println("\n");
System.out.println(" _______________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the SONWANE college FOR ARTS:: |");
System.out.println("|_______________________________________________________________________|");
demo=613;
break;
}
else if(ar[art]==614 && tenper>=50)
{
System.out.println("\n");System.out.println(" _________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the JAYKRANTI college FOR ARTS:: |");
System.out.println("|_________________________________________________________________________|");
demo=614;
break;
}
}
}
else
{
System.out.println("SORRY !!! YOU ARE NOT ELIGIBLE FOR THE ARTS TRY OTHER OPTION ");
System.out.println("Note:-\nYou can only Take addmission to ARTS when Your percentage is more than 50%");
}
break;
case 5:
int nomch;
if(tenper>35)
{
System.out.println("\n Enter your course choise to takr the NOMINAL ADDMISSION::");
System.out.println("|--------------------------------------------------------------------------------------|");
System.out.println("| CODE | | COURSE NAME | CUT OFF |");
System.out.println("| 911 | ---------> | PCB NOMINAL ADDMISSION | PASS |");
System.out.println("| 912 | ---------> | PCM NOMINAL ADDMISSION | PASS |");
System.out.println("|--------------------------------------------------------------------------------------|");
System.out.println("\n Enter Your Choice Code::");
nomch=sc.nextInt();
switch(nomch)
{
case 911:
System.out.println(" ___________________________________________________________________");
System.out.println("| CONGRATULATIONS YOU GOT ADDMISSION IN NOMINAL PCB ADDMISSION |");
System.out.println("|___________________________________________________________________|");
demo=911;
break;
case 912:
System.out.println(" ___________________________________________________________________");
System.out.println("| CONGRATULATIONS YOU GOT ADDMISSION IN NOMINAL PCM ADDMISSION |");
System.out.println("|___________________________________________________________________|");
demo=912;
break;
}break;
}
}
break;
case 12:
double twemar;
int adch;
System.out.println("Enter Your 12th Boards percentage::");twemar=sc.nextDouble();
System.out.println("\n");
System.out.println("Following Are the Course Code and Names Choose Which You Want to Persue::");
System.out.println("\n ========================= Course Menu ========================\n");
System.out.println("");
System.out.println(" |-----------------------------------------------------------------------------------------------------|");
System.out.println(" | COLLEGE CODE | ADMISSION COURSE TYPE | MARKS SOURCE TYPE |");
System.out.println(" | 1351 | ENGINEERING FIRST YEAR ADDMISSION | MHT-CET(100%+AIR) |");
System.out.println(" | 1352 | M.B.B.S MEDICAL FIRSY YEAR ADDMISSION | NEET (720+AIR) |");
System.out.println(" | 1353 | C.A COMMERCE ADDMISSION | C-seet (200+AIR) |");
System.out.println(" | 1354 | B.A. ARTS ADDMISSION | BACET (100%) |");
System.out.println(" | 1354 | IIT AND NIT ADMISSION | JEE (mains+advance) |");
System.out.println(" | 1355 | AIIMS MEDICAL ADDMISSION | JIPMER (NEET+JIPMER) |");
System.out.println(" |-----------------------------------------------------------------------------------------------------|");
System.out.println("\n Enter Your Choice For the Degree ::");
adch=sc.nextInt();
switch(adch)
{
case 1351:
double mhtmar;
int air,n;
System.out.println("\t\t");
System.out.println("!!!!!!! WELCOME TO ENGINNERING FIRST YEAR ADMISSION !!!!!!!!!!!!\n");
System.out.println("## For Admission Yoy Need To Enter Your MHT-CET Percentile and Your AIR Rank::##");
System.out.println("Enter Your MHT-CET PERCENTILE and your AIR Rank::");
mhtmar=sc.nextDouble();
air=sc.nextInt();
System.out.println("\n ========================= COLLEGE Menu ========================\n");
System.out.println("");
System.out.println("-->PLEASE FILL THE OPTION FORM IN THE FORM OF SEQUENCE OF THE COLLEGE CODE::\n");
System.out.println("|-----------------------------------------------------------------------------------------------------------------|");
System.out.println("| COLLEGE CODE | COLLEGE NAME | MHT-CET CUTOFF | A.I.R RANK |");
System.out.println("| 1651 | COLLEGE OF ENGINEERING PUNE | 97.50% | 500 |");
System.out.println("| 1652 | PUNE INSTITUTE OF COMPUTER TECHNOLOGY | 96.50% | 700 |");
System.out.println("| 1653 | V.J.T.T.I MUMBAI | 96.00% | 900 |");
System.out.println("| 1654 | VISHWAKARMA INSTITUTE OF TECHNOLOGY | 95.00% | 1000 |");
System.out.println("| 1655 | P.C.C.O.E PUNE | 92.00% | 1100 |");
System.out.println("| 1656 | MIT COLLEGE OF ENGINEERING PUNE | 90.00% | 1200 |");
System.out.println("|-----------------------------------------------------------------------------------------------------------------|");
System.out.println("\n Enter Sequence of your Choice For the Engineering college ::");
int e[]=new int[6];
for(n=0;n<=5;n++)
{
e[n]=sc.nextInt();
}
for(n=0;n<=5;n++)
{
if(e[n]==1651 && twemar>=50 && mhtmar>=97.50 && 
air<=500)
{
int z;
System.out.println("========= CONGRATS YOU ARE ELIGIBLE FOR C.O.E.P COLLEGE PUNE ======================\n");
System.out.println("--> Now Enter The branch Code For the Admission In your Selecteg branch::");
System.out.println("\n ============================== COLLEGE Menu =============================\n");
System.out.println("");
System.out.println("|------------------------------------------------------------------------------------------------------|");
System.out.println("| BRANCH CODE | BRANCH NAME | CUT OFF | A.I.R Rank |");
System.out.println("| 16511 | COMPUTER SCIENCE AND ENGINEERING | 99.20% | 200 |");
System.out.println("| 16512 | CIVIL ENGINNERING | 98.80% | 250 |");
System.out.println("| 16513 | ELECTRONICS AND TELECOMMUNICATION | 98.60% | 270 |");
System.out.println("| 16514 | ELECTRICAL ENGINEERING | 98.20% | 290 |");
System.out.println("| 16515 | MECHANICAL ENGINEERING | 98.00% | 300 |");
System.out.println("| 16516 | CHEMICAL ENGINEERING | 97.50% | 400 |");
System.out.println("| 16517 | PRODUCTION ENGINEERING | 97.20% | 450 |");
System.out.println("| 16518 | METALLURGY ENGINEERING | 97.00% | 500 |");
System.out.println("|------------------------------------------------------------------------------------------------------|");
System.out.println("\n Enter Sequence of your Choice For the Engineering college ::");
int coep[]=new int[8];
for(z=0;z<=7;z++)
{
coep[z]=sc.nextInt();
}
for(z=0;z<=7;z++){
if(coep[z]==16511 && mhtmar>=99.20 && 
air<=200)
{
System.out.println("\n\n");
System.out.println(" _______________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the C.O.E.P COLLEGE For COMPUTER SCIENCE Stream:: |");
System.out.println("|_______________________________________________________________________________________|");
dem=16511;
break;
}
else if(coep[z]==16512 && mhtmar>=98.80 && 
air<=250)
{
System.out.println("\n\n");
System.out.println(" ________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the C.O.E.P COLLEGE For CIVIL ENGINEERING Stream:: |");
System.out.println("|________________________________________________________________________________________|");
dem=16512;
break;
}
else if(coep[z]==16513 && mhtmar>=98.60 && 
air<=270){
System.out.println("\n\n");
System.out.println(" _______________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the C.O.E.P COLLEGE For E.N.T.C Stream:: |");
System.out.println("|_______________________________________________________________________________________|");
dem=16513;
break;
}
else if(coep[z]==16514 && mhtmar>=98.20 && 
air<=290)
{
System.out.println("\n\n");
System.out.println(" _____________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the C.O.E.P COLLEGE For ELECTRICAL ENGINEERING Stream:: |");
System.out.println("|_____________________________________________________________________________________________|");
dem=16514;
break;
}
else if(coep[z]==16515 && mhtmar>=98.00 && 
air<=300)
{
System.out.println("\n\n");System.out.println(" _____________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the C.O.E.P COLLEGE For MECHANICAL ENGINEERING Stream:: |");
System.out.println("|_____________________________________________________________________________________________|");
dem=16515;
break;
}
else if(coep[z]==16516 && mhtmar>=97.50 && 
air<=400)
{
System.out.println("\n\n");
System.out.println(" _______________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the C.O.E.P COLLEGE For CHEMICAL Stream:: |");
System.out.println("|_______________________________________________________________________________________|");
dem=16516;
break;
}
else if(coep[z]==16517 && mhtmar>=97.20 && 
air<=450)
{
System.out.println("\n\n");
System.out.println(" _____________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the C.O.E.P COLLEGE For PRODUCTION ENGINNERING Stream:: |");
System.out.println("|____________________________________________________________________________________________|");
dem=16517;
break;
}
else if(coep[z]==16518 && mhtmar>=97.00 && 
air<=500)
{
System.out.println("\n\n");
System.out.println(" _____________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the C.O.E.P COLLEGE For METALLURGY ENGINEERING Stream:: |");
System.out.println("|_____________________________________________________________________________________________|");
dem=16518;
break;
}
}
break;
}
else if(e[n]==1652 && twemar>=50 && mhtmar>=96.50 && 
air<=700)
{
int p;
System.out.println("========= CONGRATS YOU ARE ELIGIBLE FOR P.I.C.T COLLEGE PUNE =======================");
System.out.println("--> Now Enter The branch Code For the Admission In your Selecteg branch::");
System.out.println("\n============================== COLLEGE Menu =============================\n");
System.out.println("");
System.out.println("|-----------------------------------------------------------------------------------------------------|");
System.out.println("| BRANCH CODE | BRANCH NAME | CUT OFF | A.I.R Rank |");
System.out.println("| 16521 | COMPUTER SCIENCE AND ENGINEERING | 99.00% | 250 |");
System.out.println("| 16522 | ELECTRONICS AND TELECOMMUNICATION | 98.00% | 500 |");
System.out.println("| 16523 | INFORMATION TECHNOLOGY | 96.50% | 700 |");
System.out.println("|-----------------------------------------------------------------------------------------------------|");
System.out.println("\n Enter Sequence of your Choice For the Engineering college ::");
int pict[]=new int[3];
for(p=0;p<=2;p++)
{
pict[p]=sc.nextInt();
}
for(p=0;p<=2;p++)
{
if(pict[p]==16521 && mhtmar>=99.00 && 
air<=250)
{
System.out.println("\n\n");System.out.println(" _______________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the P.I.C.T COLLEGE For COMPUTER SCIENCE Stream:: |");
System.out.println("|_______________________________________________________________________________________|");
dem=16521;
break;
}
else if(pict[p]==16522 && mhtmar>=98.00 && 
air<=500)
{
System.out.println("\n\n");
System.out.println(" __________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the P.I.C.T COLLEGE For E.N.T.C ENGINEERING Stream:: |");
System.out.println("|__________________________________________________________________________________________|");
dem=16522;
break;
}
else if(pict[p]==16523 && mhtmar>=96.50 && 
air<=700)
{
System.out.println("\n\n");
System.out.println(" ___________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the P.I.C.T COLLEGE For I.F Stream:: |");
System.out.println("|___________________________________________________________________________________|");
dem=16523;
break;
}
}
break;
}
else if(e[n]==1653 && twemar>=50 && mhtmar>=96.00 && 
air<=900)
{
int j;
System.out.println("========= CONGRATS YOU ARE ELIGIBLE FOR V.J.T.I COLLEGE MUMBAI ======================");
System.out.println("--> Now Enter The branch Code For the Admission In your Selecteg branch::");
System.out.println("\n ============================== COLLEGE Menu =============================\n");
System.out.println("");
System.out.println("|-----------------------------------------------------------------------------------------------------|");
System.out.println("| BRANCH CODE | BRANCH NAME | CUT OFF | A.I.R Rank |");
System.out.println("| 16531 | COMPUTER SCIENCE AND ENGINEERING | 98.50% | 300 |");
System.out.println("| 16532 | CIVIL ENGINNERING | 98.20% | 450 |");
System.out.println("| 16533 | ELECTRONICS AND TELECOMMUNICATION | 98.00% | 500 |");
System.out.println("| 16534 | ELECTRICAL ENGINEERING | 97.50% | 600 |");
System.out.println("| 16535 | MECHANICAL ENGINEERING | 93.00% |530 |");
System.out.println("| 16536 | INFORMATION TECHNOLOGY | 96.00% | 900 |");
System.out.println("|-----------------------------------------------------------------------------------------------------|");
System.out.println("\n Enter Sequence of your Choice For the Engineering college ::");
int vjti[]=new int[6];
for(j=0;j<=5;j++)
{
vjti[j]=sc.nextInt();
}
for(j=0;j<=5;j++)
{
if(vjti[j]==16531 && mhtmar>=98.50 && 
air<=300)
{
System.out.println("\n\n");
System.out.println(" ______________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the V.J.T.I COLLEGE For COMPUTER SCIENCE Stream:: |");
System.out.println("|_______________________________________________________________________________________|");
dem=16531;
break;
}
else if(vjti[j]==16532 && mhtmar>=98.20 && 
air<=450)
{System.out.println("\n\n");
System.out.println(" ________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the V.J.T.I COLLEGE For CIVIL ENGINEERING Stream:: |");
System.out.println("|________________________________________________________________________________________|");
dem=16532;
break;
}
else if(vjti[j]==16533 && mhtmar>=98.00 && 
air<=500)
{
System.out.println("\n\n");
System.out.println(" _______________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the V.J.T.I COLLEGE For E.N.T.C Stream:: |");
System.out.println("|_______________________________________________________________________________________|");
dem=16533;
break;
}
else if(vjti[j]==16534 && mhtmar>=97.50 && 
air<=600)
{
System.out.println("\n\n");
System.out.println(" _____________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the V.J.T.I COLLEGE For ELECTRICAL ENGINEERING Stream:: |");
System.out.println("|_____________________________________________________________________________________________|");
dem=16534;
break;
}
else if(vjti[j]==16535 && mhtmar>=97.00 && 
air<=800)
{
System.out.println("\n\n");
System.out.println(" ____________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the V.J.T.I COLLEGE For MECHANICAL ENGINEERING Stream:: |");
System.out.println("|_____________________________________________________________________________________________|");
dem=16535;
break;
}
else if(vjti[j]==16536 && mhtmar>=96.00 && 
air<=900)
{
System.out.println("\n\n");
System.out.println(" __________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the V.J.T.I COLLEGE For I.F Stream:: |");
System.out.println("|__________________________________________________________________________________|");
dem=16536;
break;
}
}
break;
}
else if(e[n]==1654 && twemar>=50 && mhtmar>=95.00 && 
air<=1000)
{
int t;
System.out.println("========= CONGRATS YOU ARE ELIGIBLE FOR V.I.T COLLEGE PUNE ===========================");
System.out.println("--> Now Enter The branch Code For the Admission In your Selecteg branch::");
System.out.println("\n ============================== COLLEGE Menu =============================\n");
System.out.println("");
System.out.println("|-------------------------------------------------------------------------------------------------------|");
System.out.println("| BRANCH CODE | BRANCH NAME | CUT OFF | A.I.R Rank |");
System.out.println("| 16541 | COMPUTER SCIENCE AND ENGINEERING | 98.00% | 350 |");
System.out.println("| 16542 | CIVIL ENGINNERING | 97.50% | 450 |");
System.out.println("| 16543 | ELECTRONICS AND TELECOMMUNICATION | 97.20% | 500 |");
System.out.println("| 16544 | ELECTRICAL ENGINEERING | 97.00% | 600 |");
System.out.println("| 16545 | MECHANICAL ENGINEERING | 96.50% | 800 |");
System.out.println("| 16546 | INFORMATION TECHNOLOGY | 96.00% | 900 |");
System.out.println("| 16547 | CHEMICAL ENGINEERING | 95.005 | 1000 |");
System.out.println("|-------------------------------------------------------------------------------------------------------|");
System.out.println("\n Enter Sequence of your Choice For the Engineering college ::");
int vit[]=new int[7];
for(t=0;t<=6;t++)
{
vit[t]=sc.nextInt();
}
for(t=0;t<=6;t++)
{
if(vit[t]==16541 && mhtmar>=98.00 && 
air<=350)
{
System.out.println("\n\n");
System.out.println(" _____________________________________________________________________________________");
System.out.println("| Congrats your Got the admission in the V.I.T COLLEGE For COMPUTER SCIENCE Stream:: |");
System.out.println("|____________________________________________________________________________________|");
dem=16541;
break;
}
else if(vit[t]==16542 && mhtmar>=97.50 && 
air<=450)
{
System.out.println("\n\n");
System.out.println(" _____________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the V.I.T COLLEGE For CIVIL ENGINEERING Stream:: |");
System.out.println("|______________________________________________________________________________________|");
dem=16542;
break;
}
else if(vit[t]==16543 && mhtmar>=97.20 && 
air<=500)
{
System.out.println("\n\n");
System.out.println(" _____________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the V.I.T COLLEGE For E.N.T.C Stream:: |");
System.out.println("|_____________________________________________________________________________________|");
dem=16543;
break;
}
else if(vit[t]==16544 && mhtmar>=97.00 && 
air<=600)
{
System.out.println("\n\n");
System.out.println(" ___________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the V.I.T COLLEGE For ELECTRICAL ENGINEERING Stream:: |");
System.out.println("|__________________________________________________________________________________________|");
dem=16544;
break;
}
else if(vit[t]==16545 && mhtmar>=96.50 && 
air<=800)
{
System.out.println("\n\n");
System.out.println(" ___________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the V.I.T COLLEGE For MECHANICAL ENGINEERING Stream:: |");
System.out.println("|___________________________________________________________________________________________|");
dem=16545;
break;
}
else if(vit[t]==16546 && mhtmar>=96.00 && 
air<=900)
{
System.out.println("\n\n");
System.out.println(" _______________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the V.I.T COLLEGE For I.F Stream:: |");
System.out.println("|________________________________________________________________________________|");
dem=16546;
break;
}
else if(vit[t]==16547 && mhtmar>=95.00 && 
air<=1000)
{
System.out.println("\n\n");
System.out.println(" _________________________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the V.I.T COLLEGE for CHEMICAL ENGINNERING COLLEGE Stream:: |");
System.out.println("|__________________________________________________________________________________________________________|");
dem=16547;
break;
}
}
break;
}
else if(e[n]==1655 && twemar>=50 && mhtmar>=92.00 && 
air<=1100)
{
int c;
System.out.println("========= CONGRATS YOU ARE ELIGIBLE FOR P.C.C.O.E COLLEDE PUNE ==========================");
System.out.println("--> Now Enter The branch Code For the Admission In your Selecteg branch::");
System.out.println("\n ============================== COLLEGE Menu =============================\n");System.out.println("");
System.out.println("|--------------------------------------------------------------------------------------------------------|");
System.out.println("| BRANCH CODE | BRANCH NAME | CUT OFF | A.I.R Rank |");
System.out.println("| 16551 | COMPUTER SCIENCE AND ENGINEERING | 97.50% | 400 |");
System.out.println("| 16552 | CIVIL ENGINNERING | 97.00% | 600 |");
System.out.println("| 16553 | ELECTRONICS AND TELECOMMUNICATION | 96.00% | 700 |");
System.out.println("| 16554 | ELECTRICAL ENGINEERING | 95.00% | 800 |");
System.out.println("| 16555 | MECHANICAL ENGINEERING | 94.00% | 1000 |");
System.out.println("| 16556 | INFORMATION TECHNOLOGY | 92.00% | 1100 |");
System.out.println("|-------------------------------------------------------------------------------------------------------|");
System.out.println("\n Enter Sequence of your Choice For the Engineering college ::");
int pcc[]=new int[6];
for(c=0;c<=5;c++)
{
pcc[c]=sc.nextInt();
}
for(c=0;c<=5;c++)
{
if(pcc[c]==16551 && mhtmar>=97.50 && 
air<=400)
{
System.out.println("\n\n");System.out.println("_________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the P.C.C.O.E COLLEGE For COMPUTER SCIENCE Stream:: |");
System.out.println("|_________________________________________________________________________________________|");
dem=16551;
break;
}
else if(pcc[c]==16552 && mhtmar>=97.00 && 
air<=600)
{
System.out.println("\n\n");
System.out.println(" __________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the P.C.C.O.E COLLEGE For CIVIL ENGINEERING Stream:: |");
System.out.println("|__________________________________________________________________________________________|");
dem=16552;
break;
}
else if(pcc[c]==16553 && mhtmar>=96.00 && 
air<=700)
{
System.out.println("\n\n");
System.out.println(" _____________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the P.C.C.O.E COLLEGE For E.N.T.C Stream:: |");
System.out.println("|_________________________________________________________________________________________|");
dem=16553;
break;
}
else if(pcc[c]==16554 && mhtmar>=95.00 && 
air<=800)
{
System.out.println("\n\n");
System.out.println(" _____________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the P.C.C.O.E COLLEGE For ELECTRICAL ENGINEERING Stream:: |");
System.out.println("|_______________________________________________________________________________________________|");
dem=16554;
break;
}
else if(pcc[c]==16555 && mhtmar>=94.00 && 
air<=1000)
{
System.out.println("\n\n");
System.out.println(" _______________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the P.C.C.O.E COLLEGE For MECHANICAL ENGINEERING Stream:: |");
System.out.println("|_______________________________________________________________________________________________|");
dem=16555;
break;
}
else if(pcc[c]==16556 && mhtmar>=92.00 && 
air<=1100)
{
System.out.println("\n\n");
System.out.println(" ___________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the P.C.C.O.E COLLEGE For I.F Stream:: |");
System.out.println("|____________________________________________________________________________________|");
dem=16556;
break;
}
}
break;
}
else if(e[n]==1656&& twemar>=50 && mhtmar>=90.00 && 
air<=1200)
{
int m;
System.out.println("========= CONGRATS YOU ARE ELIGIBLE FOR M.I.T COLLEDE PUNE===========================");
System.out.println("--> Now Enter The branch Code For the Admission In your Selecteg branch::");System.out.println("\n ============================== COLLEGE Menu =============================\n");
System.out.println("");
System.out.println("|--------------------------------------------------------------------------------------------------|");
System.out.println("| BRANCH CODE | BRANCH NAME | CUT OFF | A.I.R Rank |");
System.out.println("| 16561 | COMPUTER SCIENCE AND ENGINEERING | 96.00% | 550 |");
System.out.println("| 16562 | CIVIL ENGINNERING | 95.00% | 600 |");
System.out.println("| 16563 | ELECTRONICS AND TELECOMMUNICATION | 94.00% | 700 |");
System.out.println("| 16564 | ELECTRICAL ENGINEERING | 93.00% | 900 |");
System.out.println("| 16565 | MECHANICAL ENGINEERING | 91.50% | 1000 |");
System.out.println("| 16566 | INFORMATION TECHNOLOGY | 90.00% | 1200 |");
System.out.println("|--------------------------------------------------------------------------------------------------|");
System.out.println("\n Enter Sequence of your Choice For the Engineering college ::");
int mit[]=new int[6];
for(m=0;m<=5;m++)
{
mit[m]=sc.nextInt();
}
for(m=0;m<=5;m++)
{
if(mit[m]==16561 && mhtmar>=96.00 && 
air<=550){
System.out.println("\n\n");
System.out.println(" _____________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the M.I.T COLLEGE For COMPUTER SCIENCE Stream:: |");
System.out.println("|_____________________________________________________________________________________|");
dem=16561;
break;
}
else if(mit[m]==16562 && mhtmar>=95.00 && 
air<=600)
{
System.out.println("\n\n");
System.out.println(" _____________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the M.I.T COLLEGE For CIVIL ENGINEERING Stream:: |");
System.out.println("|______________________________________________________________________________________|");
dem=16562;
break;
}
else if(mit[m]==16563 && mhtmar>=94.00 && 
air<=700)
{
System.out.println("\n\n");System.out.println(" _____________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the M.I.T COLLEGE For E.N.T.C Stream:: |");
System.out.println("|_____________________________________________________________________________________|");
dem=16563;
break;
}
else if(mit[m]==16564 && mhtmar>=93.00 && 
air<=900)
{
System.out.println("\n\n");
System.out.println(" _________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the M.I.T COLLEGE For ELECTRICAL ENGINEERING Stream:: |");
System.out.println("|___________________________________________________________________________________________|");
dem=16564;
break;
}
else if(mit[m]==16565 && mhtmar>=91.50 && 
air<=1000)
{
System.out.println("\n\n");
System.out.println(" ___________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the M.I.T COLLEGE For MECHANICAL ENGINEERING Stream:: |");
System.out.println("|________________________________________________________________________________________|");
dem=16565;
break;
}
else if(mit[m]==16566 && mhtmar>=90.00 && 
air<=1200)
{
System.out.println("\n\n");
System.out.println(" _______________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the M.I.T COLLEGE For I.F Stream:: |");
System.out.println("|_______________________________________________________________________________|");
dem=16566;
break;
}
}
break;
}
}
break;
case 1352:
int netmar,airr,ne;
System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^ WELCOME TO M.B.B.S First Year Admission ::^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
System.out.println("Enter Your NEET Score and A.I.R Rank::");
netmar=sc.nextInt();
airr=sc.nextInt();
System.out.println("\n=================================== COLLEGE MENU =========================================");
System.out.println("--> Fill the option form as in the form of sequence of the college code::\n\n");
System.out.println("|-----------------------------------------------------------------------------------------------------------|");
System.out.println("| CODE | | COLLEGE NAME | N.E.E.T CUT OFF | A.I.R. Rank |");
System.out.println("| 1751 | -----> | G.S.Grant Medical College, Mumbai | 680 | 1000 |");
System.out.println("| 1752 | -----> | K.E.M Medical College, Mumbai | 650 | 2000 |");
System.out.println("| 1753 | -----> | J.J Medical College , Mumbai | 640 | 4000 |");
System.out.println("| 1754 | -----> | Niar Medical College , Mumbai | 630 | 5000 |");
System.out.println("| 1755 | -----> | B.J Government Medical College, Pune | 600 | 7000 |");
System.out.println("|-----------------------------------------------------------------------------------------------------------|");
System.out.println("--> Enter your College Code Sequence To fill the Option Form::");
int med[]=new int[5];
for(ne=0;ne<=4;ne++)
{
med[ne]=sc.nextInt();
}for(ne=0;ne<=4;ne++)
{
if(med[ne]==1751 && netmar>=680 && airr<=1000)
{
System.out.println("\n\n");
System.out.println(" __________________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the G.S.Grant Medical College, Mumbai For First year:: |");
System.out.println("|__________________________________________________________________________________________________|");
dem=1751;
break;
}
else if(med[ne]==1752 && netmar>=650 && airr<=2000)
{
System.out.println("\n\n");
System.out.println(" ______________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the K.E.M Medical College, Mumbai For First year:: |");
System.out.println("|______________________________________________________________________________________________|");
dem=1752;
break;
}
else if(med[ne]==1753 && netmar>=640 && airr<=4000)
{System.out.println("\n\n");
System.out.println(" ____________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the J.J Medical College, Mumbai For First year:: |");
System.out.println("|____________________________________________________________________________________________|");
dem=1753;
break;
}
else if(med[ne]==1754 && netmar>=630 && airr<=5000)
{
System.out.println("\n\n");
System.out.println(" _____________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the Niar Medical College, Mumbai For First year:: |");
System.out.println("|____________________________________________________________________________________________|");
dem=1754;
break;
}
else if(med[ne]==1755 && netmar>=600 && airr<=7000)
{
System.out.println("\n\n");
System.out.println(" _________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the B.J Medical College, Punr For First year:: |");
System.out.println("|__________________________________________________________________________________________|");
dem=1755;
break;
}
}
break;
case 1353:
int cseet,airc,cl;
System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^ WELCOME TO COMMERCE C.A First Year Admission ::^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
System.out.println("Enter Your C.S.E.E.T Score and A.I.R Rank::");
cseet=sc.nextInt();
airc=sc.nextInt();
System.out.println("\n=================================== COLLEGE MENU =========================================");
System.out.println("--> Fill the option form as in the form of sequence of the college code::\n\n");
System.out.println("|--------------------------------------------------------------------------------------------------------|");
System.out.println("| CODE | | COLLEGE NAME | Cseet CUT OFF | A.I.R. Rank |");
System.out.println("| 1851 | -----> | ST. Xavier College, Mumbai | 190 | 1000 |");
System.out.println("| 1852 | -----> | K.J. Somaiya commerce college, Mumbai | 180 | 2000 |");
System.out.println("| 1853 | -----> | M.N.C.C.E , Mumbai | 170 | 4000 |");
System.out.println("| 1854 | -----> | Mithibai Commerce college, Pune | 150 | 5000 |");
System.out.println("| 1855 | -----> | Fergusson Commerce and Law , Pune | 130 | 7000 |");
System.out.println("|-------------------------------------------------------------------------------------------------------|");
System.out.println("--> Enter your College Code Sequence To fill the Option Form::");
int ca[]=new int[5];
for(cl=0;cl<=4;cl++)
{
ca[cl]=sc.nextInt();
}
for(cl=0;cl<=4;cl++)
{
if(ca[cl]==1851 && cseet>=190 && airc<=1000)
{
System.out.println("\n\n");
System.out.println(" ___________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the ST. Xevier College, Mumbai For First year:: |");
System.out.println("|___________________________________________________________________________________________|");
dem=1851;
break;}
else if(ca[cl]==1852 && cseet>=180 && airc<=2000)
{
System.out.println("\n\n");
System.out.println(" _________________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the K.J somaiya Commerce College, Mumbai For First year:: |");
System.out.println("|____________________________________________________________________________________________________|");
dem=1852;
break;
}
else if(ca[cl]==1853 && cseet>=170 && airc<=4000)
{
System.out.println("\n\n");
System.out.println(" ___________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the M.N.C.C.E , Mumbai For First year:: |");
System.out.println("|___________________________________________________________________________________|");
dem=1853;
break;
}
else if(ca[cl]==1854 && cseet>=150 && airc<=5000)
{
System.out.println("\n\n");System.out.println(" ________________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the Mithibai Commerce College, Pune For First year:: |");
System.out.println("|_______________________________________________________________________________________________|");
dem=1854;
break;
}
else if(ca[cl]==1855 && cseet>=130 && airc<=7000)
{
System.out.println("\n\n");
System.out.println("________________________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the Fergusson Commerce and law College , Pune For First year:: |");
System.out.println("|__________________________________________________________________________________________________________|");
dem=1855;
break;
}
}
break;
case 1354:
int ba;
double bamar;
System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^ WELCOME TO COMMERCE BAARTS First Year Admission ::^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");System.out.println("Enter Your BA-CET Score ::");
bamar=sc.nextDouble();
System.out.println("\n=================================== COLLEGE MENU =========================================");
System.out.println("--> Fill the option form as in the form of sequence of the college code::\n\n");
System.out.println("|--------------------------------------------------------------------------------------|");
System.out.println("| CODE | | COLLEGE NAME | Cseet CUT OFF |");
System.out.println("| 1951 | -----> | ST. Xavier Arts College, Mumbai | 95.50 |");
System.out.println("| 1952 | -----> | K.J. Somaiya Arts college, Mumbai | 94.00 |");
System.out.println("| 1953 | -----> | A.M.I.T.Y Arts University , Mumbai | 93.00 |");
System.out.println("| 1954 | -----> | Jay Hind Arts College, Mumbai | 90.00 |");
System.out.println("| 1955 | -----> | M.C.A.S.C Arts College , Pune | 85.00 |");
System.out.println("|--------------------------------------------------------------------------------------|");
System.out.println("--> Enter your College Code Sequence To fill the Option Form::");
int bart[]=new int[5];
for(ba=0;ba<=4;ba++)
{
bart[ba]=sc.nextInt();
}
for(ba=0;ba<=4;ba++){
if(bart[ba]==1951 && bamar>=95.50)
{
System.out.println("\n\n");
System.out.println(" ______________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the ST. Xevier Arts College, Mumbai For First year:: |");
System.out.println("|_______________________________________________________________________________________________|");
dem=1951;
break;
}
else if(bart[ba]==1952 && bamar>=94.00)
{
System.out.println("\n\n");
System.out.println(" _________________________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the K.J Somaiya Arts Commerce College, Mumbai For First year:: |");
System.out.println("|_________________________________________________________________________________________________________|");
dem=1952;
break;
}
else if(bart[ba]==1953 && bamar>=93.00)
{
System.out.println("\n\n");
System.out.println(" ____________________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the A.M.I.T.Y Arts University , Mumbai For First year:: |");
System.out.println("|____________________________________________________________________________________________________|");
dem=1953;
break;
}
else if(bart[ba]==1954 && bamar>=90.00)
{
System.out.println("\n\n");
System.out.println(" ____________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the Jay Hind Arts College, Pune For First year:: |");
System.out.println("|____________________________________________________________________________________________|");
dem=1954;
break;
}
else if(bart[ba]==1955 && bamar>=85.00)
{
System.out.println("\n\n");
System.out.println(" _____________________________________________________________________________________________");
System.out.println("| Congrats your Got the Admission in the M.C.A.S.C Arts College , Pune For First year:: |");
System.out.println("|______________________________________________________________________________________________|");
dem=1955;
break;
}
}
break;
}
break;
}
}
}
class mpdemo extends admission
{
public static void main(String args[])
{
int choice,ch1;
Student s1=new Student();
do
{
System.out.println("");
System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ STUDENT ADMISSION SYSTEM ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
System.out.println("");
System.out.println("|--------------------------------------------------|");
System.out.println("| CODE | | MENU |");
System.out.println("| 1 | ---> | NEW ADMISSION |");
System.out.println("| 2 | ---> | DISPLAY |");System.out.println("| 3 | ---> | EXIT |");
System.out.println("|--------------------------------------------------|");
System.out.println("--> Enter Your choice::");
Scanner sr=new Scanner(System.in);
choice=sr.nextInt();
switch(choice)
{
case 1:
s1.admission();
break;
case 2:
int educh;
System.out.println("");
System.out.println("|--------------------------------------------------|");
System.out.println("| CODE | | MENU |");
System.out.println("| 10 | ---> | 10th Display |");
System.out.println("| 12 | ---> | 12th Display |");
System.out.println("|--------------------------------------------------|");
System.out.println("--> Enter Your Display Choice::");
educh=sr.nextInt();
switch(educh)
{
case 10:
int tendis;System.out.println("\nEnter your choice to the course you are willing to perseu::");
System.out.println("\n");
System.out.println("************************ COURSE MENU ******************************* \n");
System.out.println("|--------------------------------------------------------------|");
System.out.println("| CODE | | COURSE NAMES |");
System.out.println("| 1 | ----> | Polytchic Course Admission:: |");
System.out.println("| 2 | ----> | 11 and 12 Science Stream Admission:: |");
System.out.println("| 3 | ----> | 11 and 12 Commerce Steram Admission:: |");
System.out.println("| 4 | ----> | 11 and 12 Arts Stream Admission:: |");
System.out.println("| 5 | ----> | To take Nominal Admission:: |");
System.out.println("|--------------------------------------------------------------|");
System.out.println("Enter Your Choice Reguarding to the menu::");
tendis=sr.nextInt();
switch(tendis)
{
case 1:
int pdis;
System.out.println("\n\n");
System.out.println("***************** POLYTECHNIC COLLEGES MENU ************************* \n");System.out.println("|--------------------------------------------------------------------|");
System.out.println("| College code | ----> | Colledge Name | CUT OFF |");
System.out.println("| 1016 | ----> | PLGPL Latur | 90% |");
System.out.println("| 1017 | ----> | VDF POLY Latur | 80% |");
System.out.println("| 1018 | ----> | JSPM POLY Latur | 70% |");
System.out.println("|--------------------------------------------------------------------|");
System.out.println("Enter Your Choice reguarding The college");
pdis=sr.nextInt();
switch(pdis)
{
case 1016:
int pol;
System.out.println("\n\n");
System.out.println(" Following are the Branches with their code::");
System.out.println("******************* BRANCH MENU ******************** \n");
System.out.println("|------------------------------------------------|");
 System.out.println("| CODE | | BRANCHES |");
System.out.println("| 2201 | -----> | Electronics |");System.out.println("| 2202 | -----> | Electrical |");
System.out.println("| 2203 | -----> | Computer |");
System.out.println("| 2204 | -----> | Mechanical |");
System.out.println("| 2205 | -----> | Civil |");
System.out.println("| 2206 | -----> | Information Techn |");
System.out.println("|------------------------------------------------|");
System.out.println("Enter the branch code::");
pol=sr.nextInt();
if(pol==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Branch = ELECTRONICS");
System.out.println("College = P.L.G.P.L");
System.out.println("");
break;
}
else if(pol==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);System.out.println("Branch = ELECTRICAL");
System.out.println("College = P.L.G.P.L");
System.out.println("");
break;
}
else if(pol==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Branch = COMPUTER");
System.out.println("College = P.L.G.P.L");
System.out.println("");
break;
}
else if(pol==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Branch = MECHANICAL");
System.out.println("College = P.L.G.P.L");
System.out.println("");
break;
}
else if(pol==s1.demo)
{
System.out.println("Name = "+s1.name);System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Branch = CIVIL");
System.out.println("College = P.L.G.P.L");
System.out.println("");
break;
}
else if(pol==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Branch = INFORMATION TECHNOLOGY");
System.out.println("College = P.L.G.P.L");
System.out.println("");
break;
}
else
{
System.out.println("NO ADMISSION!!!!");
}
break;
case 1017:
int vdfdis;
System.out.println("\n\n");
System.out.println(" Following are the Branches with their code::");
System.out.println("\n**************** BRANCH MENU *********************** \n");
System.out.println("|--------------------------------------------------------------|");
System.out.println("| CODE | | BRANCH NAMES | CUT OFF |");
System.out.println("| 2201 | -----> | Electronics | 85% |");
System.out.println("| 2202 | -----> | Electrical | 80% |");
System.out.println("| 2203 | -----> | Computer | 92% |");
System.out.println("| 2204 | -----> | Mechanical | 90% |");
System.out.println("| 2205 | -----> | Civil | 87% |");
System.out.println("| 2206 | -----> | Information Techn | 83% |");
System.out.println("|---------------------------------------------------------------|");
System.out.println("Enter the branch code::");
vdfdis=sr.nextInt();
if(vdfdis==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);System.out.println("Branch = ELECTRONICS");
System.out.println("COllege = V.D.F ");
System.out.println("");
break;
}
else if(vdfdis==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Branch = ELECTRICAL");
System.out.println("COllege = V.D.F ");
System.out.println("");
break;
}
else if(vdfdis==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Branch = COMPUTER");
System.out.println("COllege = V.D.F ");
System.out.println("");
break;
}
else if(vdfdis==s1.demo)
{System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Branch = MECHANICAL");
System.out.println("COllege = V.D.F ");
System.out.println("");
break;
}
else if(vdfdis==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Branch = CIVIL");
System.out.println("COllege = V.D.F ");
System.out.println("");
break;
}
else if(vdfdis==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Branch = INFORMATION TECHNOLOGY");
System.out.println("COllege = V.D.F ");
System.out.println("");
break;}
else
{System.out.println("NO ADMISSION !!!!!");}
 break;
case 1018:
int jspm;
System.out.println(" Following are the Branches with their code::");
System.out.println("\n**************** BRANCH MENU ******************************* \n");
System.out.println("|------------------------------------------------------------------|");
System.out.println("| CODE | | BRANCH NAMES | CUT OFF |");
System.out.println("| 2201 | -----> | Electronics | 75% |");
System.out.println("| 2202 | -----> | Electrical | 70% |");
System.out.println("| 2203 | -----> | Computer | 85% |");
System.out.println("| 2204 | -----> | Mechanical | 72% |");
System.out.println("| 2205 | -----> | Civil | 74% |");
System.out.println("| 2206 | -----> | Information Techn | 80% |");
System.out.println("|------------------------------------------------------------------|");System.out.println("Enter the branch code::");
jspm=sr.nextInt();
if(jspm==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Branch = ELECTRONICS");
System.out.println("COllege = J.S.P.M ");
System.out.println("");
break;
}
else if(jspm==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Branch = ELECTRICAL");
System.out.println("COllege = J.S.P.M ");
System.out.println("");
break;
}
else if(jspm==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Branch = COMPUTER");
System.out.println("COllege = J.S.P.M ");
System.out.println("");
break;
}
else if(jspm==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Branch = MECHANICAL");
System.out.println("COllege = J.S.P.M ");
System.out.println("");
break;
}
else if(jspm==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Branch = CIVIL");
System.out.println("COllege = J.S.P.M ");
System.out.println("");
break;
}
else if(jspm==s1.demo){
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Branch = INFORMATION");
System.out.println("COllege = J.S.P.M ");
System.out.println("");
break;
}
break;
}
break;
case 2:
int scidis;
System.out.println("\nEnter Your choice From the following code ::\n");
System.out.println("\n************************ MENU ******************************* \n");
System.out.println("|----------------------------------------------------------------|");
System.out.println("| CODE | | COURSE NAME |");
System.out.println("| 101 | --> | Admission in PCB group:: |");
System.out.println("| 102 | --> | Admission in PCM group:: |");
System.out.println("| 103 | --> | Admission in JEE group:: |");
System.out.println("| 104 | --> | Admission in AIIMSgroup:: |");System.out.println("|----------------------------------------------------------------|");
System.out.println("Enter Your choice For Display::");
scidis=sr.nextInt();
switch(scidis)
{
case 101:
int pcbdis;
System.out.println("");
System.out.println("|----------------------------------------------------------------------|");
System.out.println("| CODE | | COLLEGE NAME | CUT OFF |");
System.out.println("| 111 | --> | SHAHU COLLEGE:: (For PCB) | 95% |");
System.out.println("| 112 | --> | DAYANAND COLLEGE:: (For PCB) | 90% |");
System.out.println("| 113 | --> | SONWANE COLLEGE:: (For PCB) | 87% |");
System.out.println("| 114 | --> | JAYKRANTI COLLEGE:: (For PCB) | 85% |");
System.out.println("|----------------------------------------------------------------------|");
System.out.println("Enter Your choice to display::");
pcbdis=sr.nextInt();
if(pcbdis==s1.demo)
{
System.out.println("Name = "+s1.name);System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Stream = P.C.B");
System.out.println("College = SHAHU COLLEGE");
break;
}
else if(pcbdis==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Stream = P.C.B");
System.out.println("College = DAYANAND COLLEGE");
break;
}
else if(pcbdis==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Stream = P.C.B");
System.out.println("College = SONWANE COLLEGE");
break;
}
else if(pcbdis==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);System.out.println("Stream = P.C.B");
System.out.println("College = JAYKRANTI COLLEGE");
break;
}
break;
case 102:
int pcmdis;
System.out.println("");
System.out.println("|-------------------------------------------------------------------|");
System.out.println("| CODE | | COLLEGE NAME | CUTOFF |");
System.out.println("| 211 | --> | SHAHU COLLEGE:: (For PCM) | 95% |");
System.out.println("| 212 | --> | DAYANAND COLLEGE:: (For PCM) | 90% |");
System.out.println("| 213 | --> | SONWANE COLLEGE:: (For PCM) | 85% |");
System.out.println("| 214 | --> | JAYKRANTI COLLEGE:: (For PCM) | 80% |");
System.out.println("|-------------------------------------------------------------------|");
System.out.println("Enter Your choice for Display::");
pcmdis=sr.nextInt();
if(pcmdis==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Stream = P.C.M");
System.out.println("College = SHAHU COLLEGE");
break;
}
else if(pcmdis==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Stream = P.C.M");
System.out.println("College = DAYANAND COLLEGE");
break;
}
else if(pcmdis==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Stream = P.C.M");
System.out.println("College = SONWANE COLLEGE");
break;
}
else if(pcmdis==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Stream = P.C.M");System.out.println("College = JAYKRANTI COLLEGE");
break;
}
break;
case 103:
int jeedis;
System.out.println("\n You are Eligible for JEE Adimission::");
System.out.println("\n");
System.out.println("|------------------------------------------------------------|");
System.out.println("| COODE | COLLEGE NAME |");
System.out.println("| 811 | SHAHU College FOR JEE Batch |");
System.out.println("| 812 | DAYANAND College FOR JEE Batch |");
System.out.println("| 813 | SONWANE College FOR JEE Batch |");
System.out.println("| 814 | JAYKRANTI College FOR JEE Batch |");
System.out.println("|------------------------------------------------------------|");
System.out.println("Enter Your Choice college Code For Display::");
jeedis=sr.nextInt();
if(jeedis==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);System.out.println("Stream = J.E.E");
System.out.println("College = SHAHU COLLEGE");
break;
}
else if(jeedis==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Stream = J.E.E");
System.out.println("College = DAYANAND COLLEGE");
break;
}
else if(jeedis==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Stream = J.E.E");
System.out.println("College = SONWANE COLLEGE");
break;
}
else if(jeedis==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Stream = J.E.E");
System.out.println("College = JAYKRANTI COLLEGE");break;
}
break;
}
case 3:
int comdis;
System.out.println("");
System.out.println("|------------------------------------------------------------------------|");
System.out.println("| CODE | | COLLEGE NAME | CUT OFF |");
System.out.println("| 511 | --> | SHAHU COLLEGE OF COMMERCE:: | 85% |");
System.out.println("| 512 | --> | DAYANAND COLLEGE OF COMMERCE:: | 80% |");
System.out.println("| 513 | --> | RAJMATA JIJAMATA COMMERCE COLLEGE:: | 75% |");
System.out.println("| 514 | --> | JAYKRANTI COMMERCE COLLEGE:: | 70% |");
 System.out.println("|------------------------------------------------------------------------|");
System.out.println("Enter Your choice for Display::");
comdis=sr.nextInt();
if(comdis==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Stream = COMMERCE");
System.out.println("College = SHAHU COLLEGE");
break;
}
else if(comdis==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Stream = COMMERCE");
System.out.println("College = DAYANAND COLLEGE");
break;
}
else if(comdis==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Stream = COMMERCE");
System.out.println("College = RAJMATA JIJAMATA COMMERCE COLLEGE");
break;
}
else if(comdis==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);System.out.println("Stream = COMMERCE");
System.out.println("College = JAYKRANTI COLLEGE");
break;
}
break;
case 4:
int artdis;
System.out.println("");
System.out.println("|------------------------------------------------------------------|");
System.out.println("| CODE | | COLLEGE NAME | CUT OFF |");
System.out.println("| 611 | --> | SHAHU COLLEGE OF ARTS:: | 80% |");
System.out.println("| 612 | --> | DAYANAND COLLEGE OF ARTS:: | 75% |");
System.out.println("| 613 | --> | SONWANE COLLEGE OF ARTS:: | 60% |");
System.out.println("| 614 | --> | JAYKRANTI COLLEGE OF ARTS:: | 50% |");
System.out.println("|------------------------------------------------------------------|");
System.out.println("Enter Your choice::");
artdis=sr.nextInt();
if(artdis==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Stream = ARTS");
System.out.println("College = SHAHU COLLEGE");
break;
}
else if(artdis==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Address = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Stream = ARTS");
System.out.println("College = DAYANAND COLLEGE");
break;
}
else if(artdis==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Stream = ARTS");
System.out.println("College = SONWANE COLLEGE");
break;
}
else if(artdis==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Stream = ARTS");System.out.println("College = JAYKRANTI COLLEGE");
break;
}
break;
case 5:
int nomdis;
System.out.println("\n Enter your course choise to takr the NOMINAL ADDMISSION::");
System.out.println("|-------------------------------------------------------------------------------------|");
System.out.println("| CODE | | COURSE NAME | CUT OFF |");
System.out.println("| 911 | ---------> | PCB NOMINAL ADDMISSION | PASS |");
System.out.println("| 912 | ---------> | PCM NOMINAL ADDMISSION | PASS |");
System.out.println("|--------------------------------------------------------------------------------------|");
System.out.println("\n Enter Your Choice Code for Display::");
nomdis=sr.nextInt();
if(nomdis==s1.demo)
{
System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Stream = NOMINAL");
}
else if(nomdis==s1.demo)
{System.out.println("Name = "+s1.name);
System.out.println("Adress = "+s1.adress);
System.out.println("Date Of Birth = "+s1.dob);
System.out.println("Stream = NOMINAL");
}
break;
}
break;
case 12:
System.out.println("hello");
break;
}
break;
}
}while(choice!=3);

}
}

