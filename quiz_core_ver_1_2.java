package java_quiz;// change it for your package
import java.util.Random;
import java.util.Scanner;

public class quiz_core_ver_1_2 {//change it for you class name

    public static void main(String[] args) {

        int life = 3;//declaring 3 lives
        int score = 0;//declaring score
        int q; // declaring the user answer
        // than I declare Strings with a questions

        String question_1 ="Question 1: What is Agile? \n1. It's a programming language\n2. It's a famous soccer player\n3. It's a framework for Java\n4. It's a SDLC model.";
        String question_2 ="Question 2: The three pillars of Scrum are: \n1. Transparency, Communication, Adaption\n2. Adaption, Inspection, Communication\n3. Inspection, Adaption, Evolution\n4. Transparency, Inspection, Adaption.";
        String question_3 ="Question 3: What is the Product backlog: \n1. A short product development cycle which always ends with a shippable product.\n2. A chart representing the progress made by the team and the remaining work to be done in time units.\n3. SDLC term that is standing for huge product future.\n4. Outline of the product's timelines and priorities";
        String question_4 ="Question 4: In the agile manifesto, what is valued more than processes and tools?\n1. Customer collaboration.\n2. Working software.\n3. Individuals and interactions.\n4. Responding to change";
        String question_5 ="Question 5: Meeting for the team to get feedback from stakeholders on the completed work and to discuss and adapt the backlog and prioritization.\n All who have an interest in the product, especially key stakeholders, are encouraged to attend this meeting.\n1. Stand up meeting.\n2. Scrum.\n3. Showcase meeting.\n4. Retrospective";
        String question_6  ="Question 6: What is a lean method to manage and improve work by balancing demands with available capacity and improving the handling of bottlenecks.\nIt focuses on limiting work in progress and reduces waste from multi-tasking and context switching.\n1. Value Stream Mapping.\n2. Program Pattern.\n3. Kanban.\n4. Kaizen";
        String question_7  ="Question 7: What is recommended size for The Development Team (within the Scrum Team)?\n1. 9.\n2. 7 +/- 2.\n3. Minimal 7.\n4. 3 - 9";
        String question_8  ="Question 8: Who is responsible for managing the process of work during the Sprint\n1. The Product Owner.\n2. Business Analyst.\n3. The Scrum Master.\n4. The Development Team";
        String question_9  ="Question 9: During the sprint a Development Team determines that it will not be able to finish the complete forecast.\n Who should be present to review and adjust the Sprint work selected?: \n1.The Product Owner and all stakeholders .\n2.Scrum Master, The Project Manager and the Development Team.\n3. The Development Team.\n4. The Product Owner and the Development Team ";
        String question_10  ="Question 10: Who creates the Definition of \"Done\"?: \n1. The Product Owner as he/she is responsible for the product.\n2. The Scrum Team , in a collaborative effort where the result is the common denominator of all members' definitions.\n3. The Scrum Master as he/she is responsible for the Development Team's productivity.\n4. Stakeholders";
        String question_11  ="Question 11: The definition of \"Done\" describes the work that must be completed for every Product Backlog item before it can be deemed releasable.\nWhat should the Development Team do when, during the Sprint, it finds out that a problem outside of their control blocks them from doing all this work? : \n1. Immediately raise the issue to the Scrum Master as an impediment.\n2. Complete the work that can be done on as much scope as possible and complete the rest during the \"hardening\" sprints at the end of the release.\n3. Stop using Scrum.\n4. Complete the work that can be done on as much scope as possible and use the Sprint Review to plan the rest with the stakeholders. ";
        String question_12  ="Question 12: The length of a Sprint should be?: \n1. Short enough to keep the business risk acceptable to the Product Owner.\n2. Short enough to be able to synchronize the development work with other business events.\n3. No more than one calendar month.\n4. All of these answers are correct.";
        String question_13  ="Question 13: Which are NOT appropriate topics for discussion in a Sprint Retrospective?: \n1. The value of work currently represented in the Product Backlog.\n2. How the team does it work.\n3. Definition of \"Done\".\n4. Team relations.";
        String question_14  ="Question 14: Who should know the most about the process toward a business objective or a release, \nand be able to explain the alternatives most clearly?:\n1. The Scrum Master.\n2. The Development Team.\n3. The Product Owner.\n4. The Project Manager";
        String question_15  ="Question 15: What questions should NOT be answered in the stand-up meeting?: \n1. What will I do today?.\n2. Do I see any impediment?.\n3. What could be improved?.\n4. What did I do yesterday?";
        String question_16  ="Question 16: What is the time-box for a Daily Scrum?  \n1. 15 minutes for a 4 week sprint. For shorter Sprints it is usually shorter.\n2. 4 hours.\n3. Two minutes per person.\n4. 15 minutes";
        String question_17  ="Question 17: At the end of every sprint...  \n1. An activity needs to be completed.\n2. The team moves on without looking back.\n3. There is a potential shippable product.\n4.The teams go out for a drink";
        String question_18  ="Question 18: When might a Sprint be abnormally cancelled?  \n1. When the Sprint Goal becomes obsolete.\n2. When the sales department has an important new opportunity.\n3. When it becomes clear that not everything will be finished by the end of the Sprint.\n4. When the Development Team feels that the work won't be finished in the sprint time frame.";
        String question_19  ="Question 19: The Development Team finds out during the Sprint that they aren't likely to build everything they forecast. \nWhat would you expect a Product Owner to do?  \n1. Cancel the Sprint.\n2. Inform management that more resources are needed.\n3. Re-negotiate the selected Product Backlog items with the Development Team to meet the Sprint Goal.\n4. Change the Sprint Goal";
        String question_20  ="Question 20: What is the main reason for the Scrum Master to be at the Daily Scrum?  \n1. To make sure every team member answers the three questions.\n2. To write down any changes to the Sprint Backlog, including adding new items, and tracking  progress on the burn-down.\n3. He or she does not have to be there; he or she only has to ensure the Development Team has a Daily Scrum.\n4. To gather status and progress information to report to management";
        String question_21  ="Question 21: Development Team membership should change:  \n1. Every Sprint to promote shared learning.\n2. As needed, while taking into account a short term reduction in productivity.\n3. Never, because it reduces productivity.\n4.As needed, with no special allowance for changes in productivity";
        String question_22  ="Question 22: The time-box for the Sprint Planning meeting is?  \n1. 4 hours.\n2. Whenever it is done.\n3. 8 hours for a monthly Sprint. For shorter Sprints it is usually shorter.\n4. Monthly";
        String question_23  ="Question 23: Which statement best describes Scrum?  \n1. A complete methodology that defines how to develop software.\n2. A cookbook that defines best practices for software development.\n3. A framework within which complex products in complex environments are developed.\n4. A defined and predictive process that conforms to the principles of Scientific Management";
        String question_24  ="Question 24: When does the next Sprint begin?  \n1. Next Monday.\n2. When the Product Owner is ready.\n3. Immediately following the next Sprint Planning.\n4. Immediately after the conclusion of the previous Sprint";
        String question_25  ="Question 25: How much work must a Development Team do to a Product Backlog item it selects for a Sprint?  \n1. As much as it can fit into the Sprint.\n2. Analysis, design, programming, testing and documentation.\n3. All development work and at least some testing.\n4. As much as it has told the Product Owner will be done for every Product Backlog item it selects in conformance with the definition of \"Done\"";
        String question_26  ="Question 26: The length of a Sprint should be:  \n1. Short enough to keep the business risk acceptable to the Product Owner.\n2. Short enough to be able to synchronize the development work with other business events.\n3. No more than one month.\n4. All of these answers are correct.";
        String question_27  ="Question 27: Which statement best describes the Sprint Review?  \n1. It is a demo at the end of the Sprint for everyone in the organization to check on the work done.\n2. It is a mechanism to control the Development Team's activities during a Sprint. \n3. It is when the Scrum Team and stakeholders inspect the outcome of a Sprint and figure out what to do next.\n4. It is a  meeting where development team and Scrum master talk about impediments";
        String question_28  ="Question 28: When does a Development Team member become the sole owner of a Sprint Backlog item?  \n1. At the Sprint planning meeting.\n2. During the Daily Scrum.\n3. Never. All Sprint Backlog Items are \"owned\" by the entire Development Team, even though each one may be implemented by an individual development team member.\n4. Whenever a team member can accommodate more work";
        String question_29  ="Question 29: Who is required to attend the Daily Scrum?  \n1. The Development Team and Product Owner.\n2. The Development team.\n3. The Scrum Master and Product Owner.\n4. The Development Team and Scrum Master.";
        String question_30  ="Question 30: Which of the following services are appropriate for a Scrum Master in regard to the Daily Scrum?  \n1. Facilitate in a way that ensures each team member has a chance to speak.\n2. Teach the Development Team to keep the Daily Scrum within the 15 minute time-box.\n3. Lead the discussions of the Development Team.\n4. All answers apply.";
        String question_31  ="Question 31: Which statement best describes a Product Owner's responsibility? \n1. Managing the project and ensuring that the work meets the commitments to the stakeholders\n2. Optimizing the value of the work the Development team does\n3. Keep stakeholders from distracting the Development team\n4. Directing the Development team";
        String question_32  ="Question 32: Upon what type of process control is Scrum based?\n1. Defined\n2. Complex\n3. Empirical\n4. Hybrid";
        String question_33  ="Question 33: Is it mandatory that the product increment be released to production at the end of each sprint?\n1. True\n2. False";
        String question_34  ="Question 34: Which statement best describes the Sprint review?\n1. It is a mechanism to control the Development Team's activities during the Sprint.\n2. It is a demo at the end of the Sprint for everyone in the organization to check on the work done.\n3. It is when the Scrum Team and stakeholders inspect the outcome of a Sprint and figure out what to do next.";
        String question_35  ="Question 35: Why is the Daily Scrum held at the same time and same place?\n1. Product owner demands it.\n2. The place can be named.\n3. Rooms are hard to book and this lets it be booked in advance.\n4. the consistency reduces complexity";
        String question_36  ="Question 36: The Development Team should have all the skills needed to....\n1. Turn the Product Backlog items it selects into an increment of potentially releasable product functionality \n2. Do all of the Development work, except for specialized testing that requires additional tools and environments. \n3. Complete the project as estimated when the date and cost are committed to the Product Owner";
        String question_37  ="Question 37: What does it mean to say that an event has a time-box?\n1. The event can take no more than a maximum amount of time.\n2. The event must happen at a set time.\n3. The event must take at least a minimum amount of time\n4. The event must happen by a given time.";
        String question_38  ="Question 38: The Scrum Team should choose at least on high priority process improvement, identified during the Sprint Retrospective, and place it in the Product Backlog.\n1. True.\n2. False.";
        String question_39  ="Question 39: Scrum does not have a role called \"Project Manager.\"\n1. True.\n2. False.";
        String question_40  ="Question 40: The maximum length of the Sprint Review(its time-box) is:\n1. 2 hours.\n2. 1 day.\n3. 4 hours for a monthly Sprint. For shorter Sprints it is usually shorter.\n4. As long as needed.";
        String question_41  ="Question 41: The  purpose of a Sprint is to produce a done increment of working product\n1. True.\n2. False.";
        String question_42  ="Question 42: What is the role of Management in Scrum?\n1. Identify and remove people that aren't working hard enough.\n2. Support the Product Owner with insights and information into a high value product and system capabilities. Support the Scrum Master to cause organizational change that fosters empiricism, self-organization, bottom-up, and intelligent release of software.\n3. Monitor the Development Team's productivity.\n4. Continually monitor staffing levels of the Development team.";
        String question_43  ="Question 43: Who has the final say on the order of the Product Backlog?\n1. The Scrum Master.\n2. The Product Owner.\n3. The Stakeholders.\n4. The Development Team";
        String question_44  ="Question 44: The CEO asks the Development Team to add a \"Very Important\" item to a Sprint that is in progress. What should the Development Team do?\n1. Inform the Product Owner so he/she can work with the CEO.\n2. Add the item to the next Sprint.\n3. Add the item to the current Sprint and drop an item of the equal size.\n4. Add the item to the current Sprint without any adjustments.";
        String question_45  ="Question 45: Who should know the most about the progress toward a busyness objective or a release, and be able to explain the alternatives more clearly?\n1. The Scrum Master\n2. The Project Manager\n3. The Product Owner\n4. The Development Team";
        String question_46  ="Question 46: Who should do the Development Team during the first Sprint?\n1. Develop and deliver at least one piece of functionality\n2. Determinate the complete architecture and infrastructure of the product.\n3. Create the complete Product Backlog to be developed in subsequent Sprints.\n4. Develop a plan for the rest of the release.";
        String question_47  ="Question 47: Which event is time-boxed according to the Scrum guide?\n1. Sprint review\n2. Sprint testing\n3. Design Sprint\n4. Release Retrospective.";
        String question_48  ="Question 48: The time-box for a Daily Scrum is?\n1. Two minutes per person\n2. 15 minutes\n3. 4 hours\n4. The same time of day every day.";
        String question_49  ="Question 49: In an Agile environment, what is the main responsibility of a tester?\n1. Create test scenarios and test cases\n2. Create automation scripts\n3. Finding bugs\n4. There is no role as a Tester in Scrum";
        String question_50  ="Question 50: When is a Sprint Retrospective ceremony performed?\n1. Whenever the team suggests\n2. At the end of each Sprint\n3. Whenever needed\n4. Whenever the Product Owner suggests";


        String name = "";//declaring the user name
        Scanner input = new Scanner(System.in);//setting the scanner
        System.out.println("Welcome to the Agile quiz!");
        System.out.println("Here you can check your Agile knowledge");
        System.out.println("You have 3 lives, after 3 wrong answers your quiz will be over ");
        System.out.println("============================================================================= "+"\n\n");
        System.out.println("Please enter your name:");
        name = input.next();// User name input
        System.out.println("Hello "+name+ "! Let's get started!");
        // here I declare an array with a questions that not answered yet
        String[] quiz = {question_1, question_2, question_3, question_4, question_5, question_6, question_7,question_8,question_9,question_10, question_11, question_12, question_13, question_14, question_15, question_16, question_17, question_18, question_19,question_20, question_21, question_22, question_23, question_24, question_25, question_26, question_27, question_28, question_29, question_30, question_31, question_32, question_33, question_34, question_35, question_36, question_37, question_38, question_39, question_40, question_41, question_42, question_43, question_44, question_45, question_46, question_47, question_48, question_49,question_50};
        int[] answers = {4, 4, 4, 3, 3, 3, 4, 4, 4, 1, 1, 4, 1, 3, 3, 4, 3, 1, 3, 3, 2, 3, 3, 4, 4, 4, 3, 3, 2, 2, 2, 3, 2, 3, 4, 1, 1, 2, 1, 3, 1, 2, 2, 1, 3, 1, 1, 2, 4, 2}; // correct answers

        Random random = new Random();//import and declaring a random
        int random_index; //declaring random index(limits for random searching)
        int[] printed_questions = new int[quiz.length]; //array for answered questions


        boolean isEqual = false;
        while (!isEqual && life > 0){//loop that will work when you have a lives

            for (int i = 0; i < printed_questions.length && life > 0 ; i++){
                random_index =  random.nextInt(quiz.length);//call for random
                if (printed_questions[random_index] != 10 && life > 0){
                    printed_questions[random_index] = 10;//just a random number, changeable, no impact

                    System.out.println(quiz[random_index]); //printing a random question
                    System.out.println(name+" press 1, 2, 3 or 4 to answer");
                    q = input.nextInt(); //users input


                    if (q != answers[random_index]){
                        System.out.println("Your answer is incorrect");
                        life = life - 1;//incorrect answer - decreasing lives
                    }
                    else {
                        score = score + 1;
                        System.out.println("Your answer is correct!");//correct answer - adding the score
                    }
                    for (int n = 0; n < printed_questions.length - 1; n++){
                        if (printed_questions[n] == printed_questions[n+1]){
                            isEqual = true;
                        }
                        else {
                            isEqual = false;
                            break;
                        }
                    }
                }

            }

        }
        if (life == 0){
            System.out.println("You made three mistakes. Game over.");
        }
        else{
            System.out.println("You made it till the end of the game. Congrats!");
        }
        System.out.println("Your score is " + score);


    }
}
