run the app via docker:
1. docker build -t docker-app .
2. docker run -d -p 8000:8000 docker-app

push to dockerhub:
docker tag local-image:tagname new-repo:tagname
docker push new-repo:tagnamedocker tag firstimage YOUR_DOCKERHUB_NAME/firstimage
---
docker tag:
(need to run an image, take a hash, create a new image with tag)
docker run -it -d tsvz2011/docker-app
docker ps -a
docker commit a3ed732ac85a tsvz2011/docker-app:new
