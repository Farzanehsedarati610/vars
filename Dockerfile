FROM openjdk:17
WORKDIR /app
COPY . /app
RUN javac *.java  # ✅ Ensures all Java files compile before running
CMD ["java", "Main"]


