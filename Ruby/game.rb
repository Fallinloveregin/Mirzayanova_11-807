puts "Welcome to 'Who want to be a millionaire?'"
count = 0
mistakes = 0
print "What's your name? "
input = gets
puts "Welcome, #{input}"
puts "Do you want to play a game and make money? Write yes or no"
input = gets.chomp
if input == "yes"
    puts " Then listen to the rules of the game.
    It is necessary to correctly answer 10 questions from
    different areas of knowledge.You have 4 answer choices.
    For each wrong answer, the number of attempts will be reduced by 1.
    Total attempts 3. Good luck!"
    puts "We are starting"
    puts "   "
   
    questions=open("text.txt").read.split("\n")
    variations=open("text2.txt").read.split("\n")
    answers=open("answers.txt").read.split("\n")
    k=0

    while k<=9
    puts questions[k]
    puts variations[k]
    puts "  "
    puts "And your answer is"
    input = gets.chomp
    puts "   "
    if answers[k]==input
        count = count + 1
        puts "Wonderful, u have #{count} points"
    else
    	mistakes = mistakes + 1
        puts "I have bad news, you answered incorrectly, but you still have #{3-mistakes} attempts"
    	if mistakes == 3 
    		puts "Game over"
    		return
    	end
    end
    k=k+1
    end
    puts "Hey,u have #{k-mistakes} points,great result,Well done!!!!!!"
else
    puts "I'm sorry, we just playing here,sеrious things, go and do something else , bye-bye"
end


