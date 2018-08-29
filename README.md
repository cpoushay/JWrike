# JWrike
My attempt at a Java library for using the Wrike API. The main starting point for this library is the WrikeClient.java .

WrikeClient.Java depends upon a permenant user access token. 

Example to write all tasks to file (See Progam.java)

WrikeClient wrike = new WrikeClient(token);
List<Task> allTasks = wrike.getAllTasks();
FileUtils.printJson(fileName, allTasks);
