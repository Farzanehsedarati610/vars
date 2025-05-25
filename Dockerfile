FROM openjdk:17
WORKDIR /app
COPY . /app
RUN javac -d /app *.java  # ✅ Compiles all Java files into /app
CMD ["java", "Main"]


