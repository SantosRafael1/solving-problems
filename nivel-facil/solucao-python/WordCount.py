
def count_words(sentence):
    words = sentence.split()
    return len(words)


print(count_words("Is this working? "))
print(count_words("Python is really nice"))