# ThreadTest 

6 Players(threads) play a ball in 60s(thread). 

Player:
Clonable, Runnable 
- int id
- String name 

Timer:
Runnable 
- complete
+ isComplete 

Match Singleton
- Object ball 
- int id 
- List<Player> teamA
- List<Paayer> teamB 
- Timer timer
+ startMatch 
