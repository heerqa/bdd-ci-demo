mvn clean verify serenity:aggregate -Dwebdriver.driver=firefox
mkdir serenity
mv  target/site/serenity serenity/firefox
mv  serenity target/site/serenity

echo done