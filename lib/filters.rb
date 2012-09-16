class IncludeJava < Nanoc::Filter
  identifier :includejava

  def run(content, params={})
    content = content.gsub(/^\w+\.java/) do |file| 
      file = File.open(@item.children.find{ |i| i.binary? && i.raw_filename.split('/').last == file }.raw_filename)
      ret = "    #!java\n"
      file.each { |line| ret << "    " + line }
      ret
    end
  end

end
