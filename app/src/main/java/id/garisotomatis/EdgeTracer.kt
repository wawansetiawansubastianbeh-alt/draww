pkg install -y git unzip
termux-setup-storage
cd ~/storage/downloads
unzip GarisOtomatis.zip
cd GarisOtomatis
git init
git add .
git commit -m "Garis Otomatis"
git branch -M main
git remote add origin https://github.com/NAMAANDA/NAMAREPO.git
git push -u origin main
