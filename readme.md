If you want to create folders named "Tut-01" to "Tut-09" in the current directory, you can use a loop in the Command Prompt. Here's an example:

for /L %i in (1,1,9) do mkdir "Tut-0%i"
