JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
        $(JC) $(JFLAGS) $*.java

CLASSES = \
        RestfulServer.java \
        chat_room.java \
        
        

default: classes

classes: $(CLASSES:.java=.class)

clean:
        $(RM) *.class
