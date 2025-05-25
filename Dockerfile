FROM openjdk:17
WORKDIR /app
COPY . /app
RUN javac --enable-preview -source 17 *.java  # ✅ Enables preview features
CMD ["java", "--enable-preview", "Main"]

