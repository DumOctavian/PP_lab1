FROM openjdk:17-slim

# Instalam git
RUN apt-get update && apt-get install -y git

WORKDIR /app

# Copiem fișierele
COPY . /app

# Verificăm ce fișiere sunt în /app
RUN ls -la /app

RUN git init && \
    git config --global user.name "Your Name" && \
    git config --global user.email "you@example.com"

RUN javac Main.java

RUN git add . && \
    git commit -m "Citire din fișier implementată"

CMD ["java", "Main"]