Vagrant.configure(2) do |config|

  config.vm.box = "ubuntu/trusty64"

  config.vm.network "forwarded_port", guest: 3306, host: 3336

  config.vm.provider "virtualbox" do |vb|
    vb.gui = false
    vb.memory = "512"
   end
  
  config.vm.provision "shell", path: "shell_provisioning.sh"

  # Make puppet avail inside machine
  config.vm.provision "puppet"

  config.vm.provision "shell", inline: "service mysql restart"
end
